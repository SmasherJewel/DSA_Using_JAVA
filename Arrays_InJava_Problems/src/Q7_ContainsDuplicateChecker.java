/*
Question:
Write a Java program to check whether an array contains any duplicate elements.

The program should:
1. Ask the user to enter the size of the array.
2. Read all the array elements from the user.
3. Use a suitable data structure to track previously seen elements.
4. If any element appears more than once, return true.
5. If all elements are unique, return false.
6. Display the result as "Contains Duplicate: true/false".

Example:
Input:
Enter the size of the Array: 6
Enter 6 Elements:
1 2 3 4 2 5

Output:
Contains Duplicate: true
*/

import java.util.HashSet;
import java.util.Scanner;

public class Q7_ContainsDuplicateChecker {

    public static boolean containsDuplicate(int[] arr){
        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr){
            if (seen.contains(num)){
                return true;
            }
            seen.add(num);
        }
        return false;
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
        System.out.println("Enter "+size + " Elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        boolean result = containsDuplicate(arr);
        System.out.println("Contains Duplicate: "+result);
    }
}
