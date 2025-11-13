/*
Question:
Write a Java program to take an array of strings as input from the user and display all the elements.

The program should:
1. Ask the user to enter the size of the string array.
2. Accept that many string elements from the user.
3. Store the strings in an array.
4. Display all the string elements using Arrays.toString().

Example:
Input:
Enter the Size of the Array: 4
Enter 4 String Elements:
Java
Python
C
C++
Output:
[Java, Python, C, C++]
*/

import java.util.Arrays;
import java.util.Scanner;

public class Q2_StringArrayDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int n = sc.nextInt();
        String[] str = new String[n];

        System.out.println("Enter " + n + " String Elements: ");
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        sc.close();
        // Printing array using Arrays.toString()
        System.out.println(Arrays.toString(str));
    }
}
