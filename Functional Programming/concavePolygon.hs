-- Concave Polygon
-- Submitted by: Christina Gordon
-- https://www.hackerrank.com/challenges/lambda-march-concave-polygon/problem


import  Data.List
import  Debug.Trace


data Node = Node Int Int
    deriving (Show, Eq)
-- The given polygon is a square, and each of its  internal angles are . As none of these are over , the polygon is not concave and we print .

--convert radians to degree
radianD a = a * (180.0 / pi)

sortNodePairs (Node ax ay) (Node bx by)
    | ax > bx = GT
    | ax < bx = LT
    | ax == bx = compare ay by

sortNodes n = sortBy sortNodePairs n

segLen (Node ax ay) (Node bx by) = sqrt $ xdsq + ydsq
    where
        xdsq = (fromIntegral (bx - ax)) ** 2
        ydsq = (fromIntegral (by - ay)) ** 2


vectorsAngle (Node cx cy) (Node p0x p0y) (Node p1x p1y) = acos((p1c*p1c+p0c*p0c-p0p1*p0p1)/(2*p1c*p0c))
    where
        p0c  = sqrt(((fromIntegral(cx-p0x)) ** 2) + ((fromIntegral(cy-p0y)) ** 2))
        p1c  = sqrt(((fromIntegral(cx-p1x)) ** 2) + ((fromIntegral(cy-p1y)) ** 2))
        p0p1 = sqrt(((fromIntegral(p1x-p0x)) ** 2) + ((fromIntegral(p1y-p0y)) ** 2))

smallestAngle :: [Node] -> [Node] -> Node
smallestAngle [ a, b ] allNodes = node
    where
        angleCurr = vectorsAngle a b
        angles = map angleCurr allNodes
        minAngle = foldr1 min angles
        mbIdx = findIndex (\x -> x == minAngle) angles
        idx = case mbIdx of Just n -> n; Nothing -> 0
        node = allNodes !! idx

nodeWrap :: Node -> [Node] -> [Node] -> [Node] -> [Node]

nodeWrap target poly inits rest
    | nextNode == target = reverse poly
    | length poly > ((length (inits ++ rest)) * 2) = nub poly
    | otherwise = nodeWrap target wPoly wInits wRest
    where
        nextNode = smallestAngle inits rest
        wPoly = if length poly == 0 then reverse inits else (last inits) : poly
        wInits = (last inits) : nextNode : []
        wRest = (inits ++ rest) \\ wInits -- for second test case
--main
main = do
    raw <- getContents
    let
        lns = tail $ lines raw
        ans = map (\ln -> map (\w -> read w :: Int) (words ln)) lns
        nds = map (\dp -> Node (head dp) (last dp)) ans
        sns = sortNodes nds
        nwr = nodeWrap (sns !! 1) [] (take 2 sns) (drop 2 sns)
        res = if (length nwr) == (length sns) then "NO" else "YES"
    putStrLn res