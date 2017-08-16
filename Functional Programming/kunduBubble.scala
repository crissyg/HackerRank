/** Functional Programming  - Kundu And Bubble Wrap
* Submitted by: Christina Gordon
* https://www.hackerrank.com/challenges/kundu-and-bubble-wrap/problem
*/

/** Kundu And Bubble Wrap in Scala */

import java.io._
import scala.collection.mutable.ArrayBuffer
import scala.math

object Solution {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
		val rd = new BufferedReader(new InputStreamReader(System.in))
        val Array(n,m)= rd.readLine().split(' ').map(_.toInt);
        val h= n*m;
        var ans:Double = 0.0;
        for(i <- 1 until h + 1) {
			ans += 1.0 / i;
        }
        printf("%.10f",ans*h) //set ans to 10 decimal places
    }
}