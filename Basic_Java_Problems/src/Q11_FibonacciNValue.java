/*
Question:
Write a Java program to print the Fibonacci series up to a given number (N value).

The program should:
1. Ask the user to enter a number (N).
2. Use a for loop to generate and display all Fibonacci numbers
   less than or equal to N.
3. Display all terms starting from 0 and 1 up to the specified limit.

Example:
Input: 10
Output:
Fibonacci Series up to 10:
0 1 1 2 3 5 8
*/

// Optimized Solution

import java.util.Scanner;

public class Q11_FibonacciNValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit (N value) for Fibonacci series: ");
        int limit = sc.nextInt();
        sc.close();

        int x = 0, y = 1, z = 0;
        System.out.println("\nFibonacci Series up to " + limit + ":");
        while (x <= limit){
            System.out.print(x + " ");
            z = x + y;
            x = y;
            y = z;
        }
        System.out.println();
    }
}
