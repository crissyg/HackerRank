// Day 6: Let's Review
// Submitted by: Christina Gordon
// https://www.hackerrank.com/challenges/30-review-loop/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int tests = scan.nextInt();
        for (int i = 0; i < tests; i++) {
            String input = scan.next();
            System.out.println(splitByIndex(input));
        }
       scan.close();
    }
    
    public static String splitByIndex(String inputStr)
    {
        StringBuilder evenIndex = new StringBuilder();
        StringBuilder oddIndex = new StringBuilder();
        for(int i=0;i<inputStr.length();i++)
        {
            if(i%2==0)
            {
                evenIndex.append(inputStr.charAt(i));
            }
            else
            {
                oddIndex.append(inputStr.charAt(i));
            }
        }
        return evenIndex.toString()+" "+oddIndex.toString();
    }

}