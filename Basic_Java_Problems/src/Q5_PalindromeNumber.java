/*
Question:
Write a Java program to check whether a given number is a palindrome or not.

The program should:
1. Ask the user to enter an integer number.
2. Reverse the given number.
3. Compare the reversed number with the original number.
4. If both are the same, display that the number is a palindrome.
5. Otherwise, display that it is not a palindrome.
*/

// Optimized solution

import java.util.Scanner;

public class Q5_PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is a palindrome: ");
        int num = sc.nextInt();
        sc.close();

        int originalNum = Math.abs(num);
        int tempNum = originalNum;
        int rev = 0;

        while (tempNum > 0) {
            rev = (rev * 10) + (tempNum % 10);
            tempNum /= 10;
        }

        System.out.println("\n--- Result ---");
        if (originalNum == rev) {
            System.out.println(num + " is a Palindrome Number.");
        } else {
            System.out.println(num + " is Not a Palindrome Number.");
        }
    }
}
