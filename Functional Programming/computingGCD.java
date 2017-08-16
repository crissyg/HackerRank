// Computing GCD
// Submitted by: Christina Gordon
// https://www.hackerrank.com/challenges/functional-programming-warmups-in-recursion---gcd/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.Math;

public class Solution {
    private static int findGCD(int num1, int num2) { 
        if(num2 == 0){ 
            return num1; 
        } 
        return findGCD(num2, num1%num2); 
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int x, y;
        Scanner scan = new Scanner(System.in);
        
        x = scan.nextInt();
        y = scan.nextInt();
        
        System.out.println(findGCD(x,y)); 
        
        scan.close();
    }
}