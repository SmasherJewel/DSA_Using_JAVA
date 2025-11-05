/*
Question:
Write a Java program to print the Fibonacci series up to N terms.

The program should:
1. Ask the user to enter how many Fibonacci terms to print.
2. Use a loop to generate and display the Fibonacci sequence.
   (Each term is the sum of the previous two terms.)
3. Display all terms starting from 0 and 1 up to the specified number of terms.
Example:
Input: 7
Output:
Fibonacci Series:
0
1
1
2
3
5
8
*/

// Optimized Solution

import java.util.Scanner;

public class Q10_FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Fibonacci terms to print: ");
        int num = sc.nextInt();
        sc.close();
        
        int x = 0, y = 1, z;

        System.out.println("\nFibonacci Series:");
        for (int i = 1; i <= num; i++) {
            System.out.print(x + " ");
            z = x + y;
            x = y;
            y = z;
        }
        System.out.println();
    }
}
