/*
Question:
Write a Java program to find and display the product of digits of a given number.

The program should:
1. Ask the user to enter an integer number.
2. Extract each digit from the number and calculate the product of all digits.
3. Display the final product of the digits.
*/

// Optimized Solution

import java.util.Scanner;

public class Q3_ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to Find the Product of Digit: ");
        int num = sc.nextInt();
        sc.close();

        if (num == 0){
            System.out.println("Product of the Digits is: 0");
            return;
        }

        // it removes the negative sign
        num = Math.abs(num);
        int proOfDigit = 1;

        while (num > 0){
            proOfDigit *= num % 10;
            num /= 10;
        }
        System.out.println("Product of the Digits is: " + proOfDigit);
    }
}
