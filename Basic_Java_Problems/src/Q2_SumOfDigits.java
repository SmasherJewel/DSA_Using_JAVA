/*
Question:
Write a Java program to find and display the sum of digits of a given number.

The program should:
1. Ask the user to enter an integer number.
2. Extract each digit from the number and calculate the sum of all digits.
3. Display the total sum of the digits.
*/

// Optimized Solution

import java.util.Scanner;

public class Q2_SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find the sum of its digits: ");
        int num = sc.nextInt();
        int digitSum = 0;
        sc.close();

        while (num > 0){
            digitSum += num % 10;
            num /= 10;
        }
        System.out.println("The Sum of Digits is: " + digitSum);
    }
}
