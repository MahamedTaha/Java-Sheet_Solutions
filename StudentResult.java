Write a program flowchart to solve the following problem: Assume the input for a
student is name, student number, and three grades. Output the student name and an S
(Success) if the average of the three grades is 65 or more. Otherwise (else), output the
student’s name, a U (Un-success), and the number of additional points needed for an S




import java.util.Scanner;

public class StudentResult {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = in.next();

        System.out.print("Enter your namber : ");
        int num = in.nextInt();

        System.out.println("Enter your three Grade");
        double grade1 = in.nextDouble();
        double grade2 = in.nextDouble();
        double grade3 = in.nextDouble();

        double grades = (grade1 + grade2 + grade3) / 3;
        
        System.out.println("=============================");
        System.out.println("Name: " + name + "\tID: " + num);
        System.out.print("Your State: ");
        
        if (grades >= 65) {
            System.out.println("Success");
        } else {
            System.out.println("Un-success");
            System.out.println("The number of points you need to succeed is : " + (65 - grades));
        }
    }

}
