/*
Question:
Write a Java program to calculate Simple Interest based on user input.

The program should:
1. Ask the user to enter the Principal amount (P).
2. Ask the user to enter the Rate of interest (R).
3. Ask the user to enter the Time period in years (T).
4. Calculate Simple Interest using the formula:
      Simple Interest = (P * R * T) / 100
5. Display the calculated Simple Interest.

Example:
Input:
Enter Principal: 10000
Enter Rate: 5
Enter Time: 2
Output:
Simple Interest: 1000.0
*/

// Optimized Solution

import java.util.Scanner;

public class Q18_SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal Amount: ");
        double principle = sc.nextInt();
        System.out.print("Enter Rate of Interest: ");
        double interest = sc.nextInt();
        System.out.print("Enter Time Period (in years): ");
        double time = sc.nextInt();
        sc.close();
        System.out.println();

        double simpleInterest = (principle * interest * time) / 100;
        System.out.printf("Simple Interest: %.2f", simpleInterest);
    }
}
