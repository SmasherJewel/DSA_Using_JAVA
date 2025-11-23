/*
Question:
Write a Java program to find the length of the last word in a given string.

The program should:
1. Ask the user to enter a string.
2. Ignore any trailing spaces at the end of the string.
3. Identify the last word in the string.
4. Calculate and display the length of that last word.
5. If the string is empty or null, return 0.

Example:
Input:
Enter the String: Hello World
Output:
Length of the last word: 5

Input:
Enter the String: Java Programming
Output:
Length of the last word: 11
*/

import java.util.Scanner;

public class Q1_LengthOfLastWord {

    public static int lastLengthOfWord(String s){

        if (s == null || s.isEmpty()){
            return 0;
        }

        int i = s.length() - 1;
        int count = 0;
        // For skipping the Spaces
        while (i >= 0 && s.charAt(i) == ' '){
            i--;
        }
        // For Count the length
        while (i >= 0 && s.charAt(i) != ' '){
            count++;
            i--;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();

        int result = lastLengthOfWord(s);
        System.out.println("Length of the last word: " + result);
        sc.close();
    }
}