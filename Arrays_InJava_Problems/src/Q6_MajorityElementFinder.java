/*
Question:
Write a Java program to find the majority element in an array.

A majority element is an element that appears more than or equal to size/2 times.

The program should:
1. Ask the user to enter the size of the array.
2. Read all the array elements from the user.
3. Check each element and count how many times it appears.
4. If an element appears at least size/2 times, return it as the majority element.
5. If no majority element exists, return -1.
6. Print the result.

Example:
Input:
Enter the size of the Array: 7
Enter 7 Elements:
2 2 1 1 2 2 3

Output:
2
*/

// Not an Optimized Solution --> use brute force approach

import java.util.Scanner;

public class Q6_MajorityElementFinder {

    static int majorityElement(int[] arr, int size){
        for (int i = 0; i < size; i++) {
            int count = 0;
            int majorityEle = arr[i];

            for (int j = 0; j < size; j++) {
                if (majorityEle == arr[j]){
                    count++;
                }
            }
            if (count > size / 2){
                return majorityEle;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int size = sc.nextInt();
        if (size <= 0){
            System.out.println("Array Size Must be Positive");
            sc.close();
            return;
        }
        int[] arr = new int[size];
        System.out.println("Enter " + size + " Elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Output: "+majorityElement(arr,size));
    }
}