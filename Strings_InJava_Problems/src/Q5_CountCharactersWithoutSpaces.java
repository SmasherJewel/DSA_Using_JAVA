/*
Question:
Write a Java program to count the number of characters in a string excluding white spaces.

The program should:
1. Ask the user to enter a string.
2. Ignore all white spaces (spaces, tabs, new lines).
3. Count only visible characters.
4. Display the total number of characters excluding white spaces.

Example:
Input:
Enter a String: Hello World

Output:
Number of Characters in a String (excluding the white spaces): 10
*/

import java.util.Scanner;

public class Q5_CountCharactersWithoutSpaces {

    public static int countCharacters(String s){
        if (s == null || s.isEmpty()){
            return 0;
        }

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isWhitespace(s.charAt(i))){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        sc.close();
        int result = countCharacters(str);
        System.out.print("Number of Characters in a String (excluding the white spaces): " + result);
    }
}