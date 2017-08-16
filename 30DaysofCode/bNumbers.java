// Day 10: Binary Numbers
// Submitted by: Christina Gordon
// https://www.hackerrank.com/challenges/30-binary-numbers/problem
// java 8


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt(); // get binary number from user stdin
   		String binary = Integer.toBinaryString(num); // binary version
        int maxConsec1 = 0, Consec1=0; // maximum number of consecutive to 0
        for (int i = 0; i < binary.length(); i++) { // loop till length of binary string
			if (binary.charAt(i) == '1') { //chartAt method to search for 1 and increment
				Consec1++;
				maxConsec1 = Math.max(maxConsec1, Consec1);//Return the number with max value
			} else {
				Consec1 = 0;
			}
		}
        System.out.println(maxConsec1);
        scan.close();
    }
}
