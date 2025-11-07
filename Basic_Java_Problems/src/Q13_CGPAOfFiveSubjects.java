/*
Question:
Write a Java program to calculate the CGPA of any number of subjects entered by the user.

The program should:
1. Ask the user how many subjects they have.
2. Take CGPA input for each subject.
3. Validate that each CGPA is between 0.00 and 10.00.
4. Calculate and display the average CGPA.
5. Display the result formatted up to 2 decimal points.

*/

// Optimized Solution

import java.util.Scanner;

public class Q13_CGPAOfFiveSubjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int n = sc.nextInt();

        if (n <= 0){
            System.out.println("Invalid input! Number of subjects must be greater than 0.");
            sc.close();
            return;
        }
        float[] subjects = new float[n];
        float sum = 0;
        System.out.println("\nEnter CGPA for each subject (0.00 to 10.00):");

        for (int i = 0; i < n; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjects[i] = sc.nextFloat();

            if (subjects[i] < 0.0 || subjects[i] > 10.00){
                System.out.println("Invalid CGPA! Each subject’s CGPA must be between 0.00 and 10.00");
                sc.close();
                return;
            }
            sum += subjects[i];
        }
        sc.close();
        float cgpa = sum / n;
        System.out.println("\nTotal CGPA for " + n + " subjects is: " + String.format("%.2f", cgpa));
    }
}
