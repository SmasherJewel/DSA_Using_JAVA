/*
Question:
Write a Java program to take an array of integers as input from the user and display all its elements.

The program should:
1. Ask the user to enter the size of the array.
2. Read that many integer elements from the user.
3. Store all elements in an array.
4. Display all the entered elements one by one.

Example:
Input:
Enter the Size of the Array: 5
Enter 5 Elements:
10
20
30
40
50
Output:
Array Elements are:
10
20
30
40
50
*/

import java.util.Scanner;

public class Q1_ArrayInputDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("Array Elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
