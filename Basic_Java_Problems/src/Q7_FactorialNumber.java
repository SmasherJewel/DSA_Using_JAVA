/*
Question:
Write a Java program to find and display the factorial of a given number.

The program should:
1. Ask the user to enter an integer number.
2. Calculate the factorial of the number using a loop.
3. Display the factorial result.
Example:
Input: 5
Output: Factorial of 5 is 120
*/

// Optimized Solution

import java.util.Scanner;

public class Q7_FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int num = sc.nextInt();
        sc.close();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }

        long fac = 1;
        for (int i = 1; i <= num; i++) {
            fac *= i;
        }
        System.out.println("Factorial of " + num + " is: " + fac);
    }
}
