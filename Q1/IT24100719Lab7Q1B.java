import java.util.Scanner;
public class IT24100719Lab7Q1B {
	public static void main(String[] args) {

	
	Scanner input = new Scanner(System.in);
	
	for (int student = 1; student <= 3; student++) {
		System.out.println("Student " + student);


	double totalMarks = 0;
	for (int subject = 1; subject<=4; subject++) {
		System.out.print("Enter marks for subject " + subject + ":");

	int marks = input.nextInt();
	totalMarks += marks;
	}

	double averageMarks = totalMarks / 4;
	System.out.println("Average is : " + totalMarks / 4);

	String grade;

	if (averageMarks >= 75) {
		grade = "Distinction";
	}
		else if (averageMarks >= 50) {
			grade = "Credit";
		}
		else {
			grade = "Fail";
		}

	System.out.println("Overall Grade is : " + grade);
	System.out.println();
	}
	input.close();
 }
}