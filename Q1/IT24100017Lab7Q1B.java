import java.util.Scanner;

public class IT24100017Lab7Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int student = 1; student <= 3; student++) {
            System.out.println("Student " + student + ":");
            System.out.print("Enter marks: ");
            String[] marksInput = input.nextLine().split(" ");
            
            int sum = 0;
            for (String mark : marksInput) {
                sum += Integer.parseInt(mark);
            }

            double avg = (double) sum / marksInput.length;
            System.out.println("Average is: " + avg);

            String grade;
            if (avg >= 75.0) {
                grade = "Distinction";
            } else if (avg >= 50.0 && avg < 75.0) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }

            System.out.println("Overall Grade is: " + grade);
            System.out.println();
        }

        input.close();
    }
}
