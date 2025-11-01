/*
Question:
Write a Java program to calculate and display:
1. The sum of all even digits, and
2. The product of all odd digits
from a given integer number.

The program should:
1. Ask the user to enter an integer number.
2. Extract each digit from the number.
3. Add all even digits to get their sum.
4. Multiply all odd digits to get their product.
5. Display both the sum of even digits and the product of odd digits.
6. If there are no odd digits, display a suitable message.
*/

// Optimized solution

import java.util.Scanner;

public class Q4_SumAndProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int num = sc.nextInt();
        sc.close();

        num = Math.abs(num);

        int sumOfEven = 0,productOfOdd = 1;
        boolean hasOdd = false;
        while (num > 0){
            int digit = num % 10;

            if (digit % 2 == 0){
                sumOfEven  += digit;
            }
            else {
                productOfOdd *= digit;
                hasOdd = true;
            }
            num /= 10;
        }

        System.out.println("\n--- Result ---");
        System.out.println("Sum of digit: " + sumOfEven);
        if (hasOdd){
            System.out.println("Product of digit: " + productOfOdd);
        }
        else {
            System.out.println("No odd digits found in the number.");
        }
    }
}
