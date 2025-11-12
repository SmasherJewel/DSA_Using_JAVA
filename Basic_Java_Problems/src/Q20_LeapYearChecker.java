/*
Question:
Write a Java program to check whether a given year is a leap year or not.

The program should:
1. Ask the user to enter a year.
2. Check the following conditions:
   - A year is a leap year if it is divisible by 4 but not by 100, OR it is divisible by 400.
3. Display whether the entered year is a leap year or not.

Example:
Input:
Enter Year: 2024
Output:
2024 is a Leap Year
*/

// Optimized Solution

import java.util.Scanner;

public class Q20_LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year = sc.nextInt();
        sc.close();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + " is a Leap Year");
        }else {
            System.out.println(year + " is not a Leap Year");
        }
    }
}
