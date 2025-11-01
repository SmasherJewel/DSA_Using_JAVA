/*
Question:
Write a Java program to check whether a given number is a prime number or not.

The program should:
1. Ask the user to enter an integer number.
2. A number is said to be prime if it is greater than 1 and divisible only by 1 and itself.
3. Use an optimized approach by checking divisibility up to the square root of the number.
4. Display “Prime Number” if it is prime, otherwise display “Not a Prime Number”.
*/

// Optimized Solution

import java.util.Scanner;

public class Q6_PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");
        int num = sc.nextInt();
        sc.close();

        if (num <= 1) {
            System.out.println("Not a Prime Number");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
    }
}
