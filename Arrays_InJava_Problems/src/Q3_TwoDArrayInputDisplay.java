/*
Question:
Write a Java program to take a 2D array (matrix) as input from the user and display all its elements.

The program should:
1. Ask the user to enter the number of rows and columns.
2. Read all the elements of the 2D array from the user.
3. Store the elements in a 2D array.
4. Display the array elements in matrix form.

Example:
Input:
Enter the size of the Row: 2
Enter the size of the Column: 3
Enter Array Elements:
1 2 3
4 5 6
Output:
Array Elements are:
1 2 3
4 5 6
*/

import java.util.Arrays;
import java.util.Scanner;

public class Q3_TwoDArrayInputDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Row: ");
        int row = sc.nextInt();
        System.out.print("Enter the size of the Column: ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        // Shortcut way to print
        System.out.println("Array Elements are: ");
        System.out.println(Arrays.deepToString(arr));

        // Using Index based
        /*System.out.println("Array Elements are: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }*/
    }
}
