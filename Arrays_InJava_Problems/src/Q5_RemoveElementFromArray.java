/*
Question:
Write a Java program to remove all occurrences of a given value from an array.

The program should:
1. Ask the user to enter the size of the array.
2. Read all array elements from the user.
3. Ask for a value to remove from the array.
4. Remove every occurrence of that value by shifting the remaining elements.
5. Return the count of elements left after removal.
6. Display the updated array containing only the remaining elements.

Example:
Input:
Enter the size of the Array: 7
Enter 7 Elements:
3 2 2 3 4 3 5
Enter the value you want to remove: 3

Output:
Number of elements after removal: 4
Updated Array after removing the value:
2 2 4 5
*/

// LeetCode 27 no Problem

// Both Solution Combined

import java.util.Scanner;

public class Q5_RemoveElementFromArray {

    static int removeElement(int[] num, int val){
        int left = 0;
        int right = num.length - 1;

        while (left <= right){
            if (num[left] == val){
                num[left] = num[right];
                right--;
            }else {
                left++;
            }
        }
        return left;
    }

    static int removeElementPreserveOrder(int[] num, int val){
        int k = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] != val){
                num[k] = num[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        if (n <= 0){
            System.out.println("Array Size Must Be Positive");
            sc.close();
            return;
        }
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the value want to remove: ");
        int val = sc.nextInt();

        int k;
        System.out.println("\nChoose Method: ");
        System.out.println("1 → Optimized Fast (Order Not Preserved)");
        System.out.println("2 → Preserve Order (Stable)");
        int choice = sc.nextInt();
        sc.close();
        if (choice == 1){
            k = removeElement(arr,val);
            System.out.println("\nUsing Optimized Two-Pointer (Order Not Preserved)");
        }else {
            k = removeElementPreserveOrder(arr,val);
            System.out.println("\nUsing Order-Preserving Remove Method");
        }

        System.out.println("Number of elements after removal: " + k);
        System.out.println("Updated Array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


// Optimized Approach Using Two-Pointer Approach --> Order is not Maintained

/*import java.util.Scanner;

public class Q5_RemoveElementFromArray {

    static int removeElement(int[] num, int val){
        int left = 0;
        int right = num.length - 1;

        while (left <= right){
            if (num[left] == val){
                num[left] = num[right];
                right--;
            }else {
                left++;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int size = sc.nextInt();
        // Checking for Positive value
        if (size <= 0){
            System.out.println("Array Size must be Positive");
            sc.close();
            return;
        }
        int[] arr = new int[size];

        // Taking Input
        System.out.println("Enter " + size + " Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value you want to remove: ");
        int val = sc.nextInt();
        sc.close();

        int k = removeElement(arr,val);
        System.out.println("Number of elements after removal: " + k);

        System.out.println("Updated Array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}*/


// Not An Optimized Approached --> Order is Maintained

/*
import java.util.Scanner;

public class Q5_RemoveElementFromArray {


    static int removeElement(int[] num, int val){
        int k = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] != val){
                num[k] = num[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value you want to remove: ");
        int val = sc.nextInt();
        sc.close();

        int k = removeElement(arr,val);
        System.out.println("Number of elements after removal: " + k);
        System.out.println("Updated Array after removing the value: ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
*/
