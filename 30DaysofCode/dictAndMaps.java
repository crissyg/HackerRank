// Day 8: Dictionaries and Maps
// Submitted by: Christina Gordon
// https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution{
    public static void main(String []argh){
        Map<String,Integer> myMap = new HashMap<String,Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            myMap.put(name, phone);
            // Write code here
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here 
            if(myMap.containsKey(s)== true)
            {
                System.out.println(s  + "=" +myMap.get(s));
               
            }else 
            {
                 System.out.println("Not found");                
            }
        }
        in.close();
    }
}
