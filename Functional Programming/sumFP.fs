// Solve Me First FP
// Submitted by: Christina Gordon
//https://www.hackerrank.com/challenges/fp-solve-me-first/problem
//Description : Your task is to scan two numbers,  A and B from STDIN, and print the sum A + B on STDOUT.


open System

[<EntryPoint>]
let main argv = 
    let a = Console.ReadLine() |> int
    let b = Console.ReadLine() |> int
    printfn "%d" (a+b)
    0 // return an integer exit code
