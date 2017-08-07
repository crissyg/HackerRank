// Day 7: Arrays
// Submitted by: Christina Gordon
// https://www.hackerrank.com/challenges/30-arrays/problem

import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        for(int r=(arr.length-1); r >=0; r--){
            System.out.print(arr[r]+" ");
        }
    }
}
