/*
Question:
Write a Java program to print the multiplication table of a given number up to a specified range.

The program should:
1. Ask the user to enter the number for which the multiplication table is to be printed.
2. Ask the user to enter the range (how many multiples to display).
3. Use a loop to print the multiplication table of the given number up to the specified range.
Example:
Input:
Enter the no of table you want to print: 5
Enter the no of range to print the table: 10

Output:
5 * 1 : 5
5 * 2 : 10
5 * 3 : 15
...
5 * 10 : 50
*/

// Optimized Solution

import java.util.Scanner;

public class Q9_MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for which you want to print the table: ");
        int no = sc.nextInt();
        System.out.print("Enter the range up to which you want to print: ");
        int range = sc.nextInt();
        sc.close();

        System.out.println("\nMultiplication Table of " + no + ":");
        for (int i = 1; i <= range; i++) {
            System.out.println(no + " * " + i + " : " + (no * i));
        }
    }
}
