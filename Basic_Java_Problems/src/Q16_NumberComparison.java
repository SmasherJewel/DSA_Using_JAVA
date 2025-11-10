/*
Question:
Write a Java program to check whether a user-entered number is greater than, less than, or equal to 10.

The program should:
1. Ask the user to enter an integer number.
2. Check if the entered number is greater than 10, equal to 10, or less than 10.
3. Display an appropriate message based on the comparison result.

Example:
Input:
Enter No: 12
Output:
The 12 is Greater than 10
*/

// Optimized Solution

import java.util.Scanner;

public class Q16_NumberComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        if (num > 10){
            System.out.println("The number " + num + " is greater than 10.");
        } else if (num == 10) {
            System.out.println("The number is exactly 10.");
        }else {
            System.out.println("The number " + num + " is less than 10.");
        }
    }
}
