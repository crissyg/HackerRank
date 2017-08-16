// Day 11: 2D Arrays
// Submitted by: Christina Gordon
// https://www.hackerrank.com/challenges/30-2d-arrays/problem


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int maxHourGSum = -99999 , newSum= 0;
        for(int i=1; i < 6-1 ; i++){
            for(int j=1; j < 6-1 ; j++){
                newSum = arr[i][j]+arr[i-1][j]+arr[i-1][j-1]+arr[i-1][j+1]+arr[i+1][j]+arr[i+1][j-1]+arr[i+1][j+1];
                if(maxHourGSum < newSum){
                    maxHourGSum = newSum;
                }
            }
        }
        System.out.println(maxHourGSum);
    }
}
