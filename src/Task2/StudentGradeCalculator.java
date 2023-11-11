package Task2;

import java.util.Scanner;

public class StudentGradeCalculator {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Student Grade Calculator");
	System.out.println("Enter the number of subjects");
	int numSubjects = sc.nextInt();
	
	if(numSubjects <= 0)
	{
		System.out.println("Please enter a valid number of subjects ");
	}
	
	double totalMarks = 0;
	
	for(int i =1; i <=numSubjects; i++)
	{
		System.out.println("Enter marks obtained in subject " + i + ":");
		double marks = sc.nextDouble();
		
		if(marks < 0 || marks > 100)
		{
			System.out.println("marks should be between 0 and 100. Please enter a valid value");
			i--;
		}else {
			totalMarks += marks;
		}
		
	}
	
	double averagePercentage = totalMarks /(numSubjects * 100);
	double percentage = averagePercentage *100;
	
	String grade;
	
	if(percentage >= 90)
	{
		grade = "A+";
	}else if(percentage >= 80) {
		grade = "A";
	}else if(percentage >= 70) {
		grade = "B";
	}else if(percentage >= 60) {
		grade = "C";
	}else if(percentage >= 50) {
		grade = "D";
	}else {
		grade = "F";
	}
	
	System.out.println("Total Marks: " + totalMarks);
	System.out.println("Average Percentage: " + percentage + "%");
	System.out.println("Grade: " + grade);
		
}
}
