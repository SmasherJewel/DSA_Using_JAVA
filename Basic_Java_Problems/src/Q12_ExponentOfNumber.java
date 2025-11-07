/*
Question:
Write a Java program to find the exponent (power) of a given number.

The program should:
1. Ask the user to enter the base number.
2. Ask the user to enter the power (exponent) value.
3. Use a loop to calculate the result by multiplying the base repeatedly.
4. Display the final result of the exponent operation.

Example:
Input:
Enter The Base No: 3
Enter The Power of the No: 4
Output:
The Exponent of the No is: 81
*/

// Optimized Solution

import java.util.Scanner;

public class Q12_ExponentOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int base = sc.nextInt();
        System.out.print("Enter the power of the number: ");
        int power = sc.nextInt();
        sc.close();

        int result = 1;
        if (power == 0){
            result = 1;
        } else if (power > 0) {
            int tempPower = power;
            while (tempPower > 0){
                result *= base;
                tempPower--;
            }
        }else {
            System.out.println("Negative powers are not handled in this program.");
            return;
        }
        System.out.println("\nResult (" + base + "^" + power + ") = " + result);
    }
}
