// Day 5: Loops
// Submitted by: Christina Gordon
// https://www.hackerrank.com/challenges/30-loops/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int product;
        for (int i =1; i<=10; i++){
            product = n*i;
            System.out.println(n+" x "+i+" = "+product);
        }
        
    }
}
