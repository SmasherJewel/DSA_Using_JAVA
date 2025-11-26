/*
Question:
Write a Java program to reverse the order of words in a given sentence.

The program should:
1. Ask the user to enter a sentence.
2. Remove extra spaces from the beginning and end of the sentence.
3. Split the sentence into individual words.
4. Reverse the order of the words.
5. Display the reversed sentence.

Example:
Input:
Enter a String: Hello World from Java

Output:
Reversed Sentence: Java from World Hello

Input:
Enter a String:   I love coding
Output:
Reversed Sentence: coding love I
*/

import java.util.Scanner;

public class Q3_ReverseWordsInString {

    public static String reverseWord(String s){

        //  For handling null or empty input safely
        if (s == null || s.trim().isEmpty()){
            return "";
        }

        s = s.trim();
        String[] words = s.split("\\s+");

        StringBuilder result = new StringBuilder();
        for (int i = words.length -1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0){
                result.append(" ");
            }
        }
        // Convert into String
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        String result = reverseWord(str);
        System.out.print("Reversed Sentence: "+result);
        sc.close();
    }
}