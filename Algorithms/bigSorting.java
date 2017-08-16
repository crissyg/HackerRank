/* Algorithms - Big Sorting
Submitted by: Christina Gordon
https://www.hackerrank.com/challenges/big-sorting
Problem: Consider an array of numeric strings,unsorted , where each string is a positive number with anywhere from 1 to 10^6 digits. 
Sort the array's elements in non-decreasing (i.e., ascending) order of their 
real-world integer values and print each element of the sorted array on a new line.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];  
        for(int i = 0; i < n; i++) {
            unsorted[i] = in.next();
        }
        //sort the array
        Arrays.sort(unsorted,new Comparator<String>() {
            @Override
            public int compare(String a, String b) 
            {
                return StringAsIntegerCompare(a,b);
            }
        });
        //Print sorted array
        StringBuilder output = new StringBuilder("");
        for(String num : unsorted){
            output.append(num+"\n");
        }
        System.out.println(output);
        
     }
    
    //String AS Intger Compare
        static int StringAsIntegerCompare(String s1, String s2)
        {
          if(s1.length() > s2.length()) {
              return 1;}
            if(s1.length() < s2.length()) {
                return -1;}
             for(int i = 0; i < s1.length(); i++)
             {
             if((int)s1.charAt(i) > (int)s2.charAt(i)) {
                    return 1;}
                 if((int)s1.charAt(i) < (int)s2.charAt(i)) {
                     return -1;}
        }
        return 0;
    }
}