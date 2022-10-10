package edu.monmouth.grade;
import java.util.Scanner;
public class ProblemSet1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter Grade: ");
	    double grade = input.nextDouble();
	    String gradeLetter = "";
	    if (grade > 90) {
	    	gradeLetter = "A";
	    }
	    else if (grade > 80) {
	    	gradeLetter = "B";
	    }
	    else if (grade > 70) {
	    	gradeLetter = "C";
	    }
	    else if (grade > 60) {
	    	gradeLetter = "D";
	    }
	    else {
	    	gradeLetter = "F";
		      
		      
	      System.out.println("Grade letter is " gradeLetter);
				
				
	}

}
