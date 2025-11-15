/*
Question:
Write a Java program to take integer inputs into an ArrayList and display all the elements.

The program should:
1. Ask the user to enter the size of the ArrayList.
2. Accept that many integer values from the user.
3. Store all the integers in an ArrayList.
4. Display the elements of the ArrayList.

Example:
Input:
Enter the size of the List: 5
Enter 5 Numbers:
10
20
30
40
50

Output:
Array Elements are: [10, 20, 30, 40, 50]
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Q4_ArrayListInputIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter the size of the List: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " Numbers: ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        sc.close();

        System.out.println("List Elements are: " + list);
    }
}
