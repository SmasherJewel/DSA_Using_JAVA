/*
Question:
Write a Java program to find and display all duplicate values present in an array.

The program should:
1. Ask the user to enter the size of the array.
2. Read all array elements from the user.
3. Use a HashSet to track already seen elements.
4. Identify and collect all values that appear more than once.
5. If no duplicate values are found, display an appropriate message.
6. Otherwise, display all duplicate values.

Example:
Input:
Enter the size of the Array: 8
Enter 8 Elements:
1 2 3 4 2 5 3 6

Output:
Duplicate Values are: [2, 3]
*/

// I need to solve without using the hash-map ---> It's still pending

import java.util.HashSet;
import java.util.Scanner;

public class Q8_FindDuplicateValues {

    public static void duplicateValues(int[] arr){
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();

        for (int num : arr){
            if (!seen.add(num)){
                duplicate.add(num);
            }
        }
        if (duplicate.isEmpty()){
            System.out.println("Array doesn't contain any duplicate value");
        }else {
            System.out.println("Duplicate Values are: " + duplicate);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int size = sc.nextInt();
        if (size <= 0){
            System.out.println("Array size must be Positive");
            sc.close();
            return;
        }
        int[] arr = new int[size];
        System.out.println("Enter " + size + " Elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        duplicateValues(arr);
    }
}
