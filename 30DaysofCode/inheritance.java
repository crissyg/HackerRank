// Day 12: Inheritance
// Submitted by: Christina Gordon
// https://www.hackerrank.com/challenges/30-inheritance/problem

class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    Student(String firstName, String lastName, int identification, int[] scores){
		super(firstName, lastName, identification);
        this.testScores = scores;
	}

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    
    public char calculate(){
     //   char ch;
     //   if(testScores < 40) return 'T';
            char ch = 'T';
            if (testScores == null) {
            return ch;
            }
            int n = testScores.length;
            if (n <= 0) {
                return ch;
            }

            int sum = 0;
            for (int i : testScores){
                 sum += i;
            }
            int ave = sum / n;
            if (ave <= 100 && ave >= 90) {
                 ch = 'O';
            } else if (ave < 90 && ave >= 80) {
                 ch = 'E';
            } else if (ave < 80 && ave >= 70) {
                 ch = 'A';
            } else if (ave < 70 && ave >= 55) {
                ch = 'P';
            } else if (ave < 55 && ave >= 40) {
                ch = 'D';
            } else {
                ch = 'T';
            }
            return ch;
            
    }
}