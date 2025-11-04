/*
Question:
Write a Java program to print all prime numbers within a given range and display their total count.

The program should:
1. Ask the user to enter a number (range limit).
2. Check each number from 1 up to the entered number to determine if it is prime.
3. Print all prime numbers within the range.
4. Count and display the total number of prime numbers found.
5. If the range is less than or equal to 1, display a suitable message.
Example:
Input: 10
Output:
Prime Numbers are:
2
3
5
7
Total Prime Numbers are: 4
*/

// Optimized Solution

import java.util.Scanner;

public class Q8_PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range to print prime numbers: ");
        int num = sc.nextInt();
        sc.close();

        if (num < 2){
            System.out.println("Range less than 2 cannot have prime numbers.");
            return;
        }

        int total = 0;
        System.out.println("Prime Numbers Are: ");

        for (int i = 2; i <= num; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(i);
                total++;
            }
        }
        System.out.println("\nTotal Prime Numbers are: " + total);
    }
}
