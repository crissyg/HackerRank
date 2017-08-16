/** Functional Programming  - Game of Kyles
* Submitted by: Christina Gordon
* https://www.hackerrank.com/challenges/game-of-kyles/problem
*/

/** Game of Kyles in Scala */


import java.io._
import scala.collection.mutable.ArrayBuffer
import scala.math

object Solution {
    //instantiate an ArrayBuffer object, then add elements
	var bowl = ArrayBuffer.fill(301)(-1)
	def main(args: Array[String]) {
		bowl(0) = 0
		val rd = new BufferedReader(new InputStreamReader(System.in))
		val T = rd.readLine().toInt
		for (i <- 0 until T) {
			val N = rd.readLine().toInt
			val a = rd.readLine().split('X').map(_.length)
			var res = 0
			for (x <- a) {
				res ^= dfs(x)
			}
			if (res == 0) {
				println("LOSE")
			} else {
				println("WIN")
			}
		}
	}
	def dfs(x : Int) : Int = {
		if (bowl(x) != -1) {
			return bowl(x)
		}
		var v = ArrayBuffer.fill(100)(false)
		for (i <- 0 until x) {
			v(dfs(i) ^ dfs(x - i - 1)) = true
		}
		for (i <- 0 until (x - 1)) {
			v(dfs(i) ^ dfs(x - i - 2)) = true
		}
		for (i <- 0 until v.length) {
			if (!v(i)) {
				bowl(x) = i
				return bowl(x)
			}
		}
		return -1
	}
}