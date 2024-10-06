import java.util.Scanner;

public class IT24100017Lab7Q1A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter marks for four subjects:");

		int sum = 0;
		for (int i = 1; i <=  4; i=i+1) {
			System.out.print("Enter Subject Mark "  + i +  ": ");
			int marks = input.nextInt();
			sum = sum + marks;
		}

		System.out.println("");

		double avg = (double) sum / 4;
		System.out.println("Average is:" + avg );

		String grade;
		if (avg >= 75.0) {
			grade = "Distinction";
		} else if (75.0 > avg && avg >= 50.0) {
			grade = "Credit";
		} else {
			grade = "Fail";
		}

		System.out.println("Overall Grade is:" + grade);

		input.close();
	}
}
	