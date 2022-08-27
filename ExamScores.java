Based on students’ exam scores, give each of them a rate of appreciation and print the
result. Ranges for rates of appreciation are listed below
• Excellent: greater than or equal 85 and less than 100
• Very good: greater than or equal 75 and less than 85
• Good: greater than or equal 65 and less than 75
• Pass: greater than or equal 50 and less than 65
• Fail: less than 50

    
import java.util.Scanner;

public class ExamScores {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double grade; // variable to store the grade

        System.out.print("Enter grade : ");
        grade = in.nextDouble(); // take the grade from the scanner

        if (grade >= 85 && grade < 100) {
            System.out.print(" Excellent");
        } else if (grade >= 75 && grade < 85) {
            System.out.print("very good");
        } else if (grade >= 65 && grade < 75) {
            System.out.print("good");
        } else if (grade >= 50 && grade < 65) {
            System.out.print("pass");
        } else {
            System.out.println("fail");
        }

    }

}
