/*
Question:
Write a Java program to find the index of the first occurrence of a substring within a given string.

The program should:
1. Ask the user to enter a main string (haystack).
2. Ask the user to enter a substring (needle).
3. Search for the first occurrence of the substring in the main string.
4. Return and display the index where the substring first appears.
5. If the substring is not found, return -1.
6. If the substring is empty, return 0.

Example:
Input:
Enter Haystack: hello world
Enter Needle: world

Output:
Result Index: 6

Input:
Enter Haystack: programming
Enter Needle: java

Output:
Result Index: -1
*/


import java.util.Scanner;

public class Q2_FirstOccurrenceIndex {

    public static int findIndex(String haystack, String needle){
        if (needle.isEmpty()){
            return 0;
        }

        for (int i = 0; i < haystack.length() - needle.length(); i++) {
            int j = 0;
            while (j < needle.length() && haystack.charAt(i + j) == needle.charAt(j)){
                j++;
            }
            if (j == needle.length()){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Haystack: ");
        String haystack = sc.nextLine();
        System.out.print("Enter Needle: ");
        String needle = sc.nextLine();

        int result = findIndex(haystack,needle);
        System.out.println("Result Index: " + result);
        sc.close();
    }
}