/*
Question:
Write a Java program to check whether a given string is a palindrome.

The program should:
1. Ask the user to enter a string.
2. Ignore spaces, punctuation, and special characters.
3. Compare characters in a case-insensitive manner.
4. Determine whether the string reads the same forward and backward.
5. Display whether the entered string is a palindrome or not.

Example:
Input:
Enter a String: A man, a plan, a canal: Panama

Output:
"A man, a plan, a canal: Panama" is Palindrome

Input:
Enter a String: Hello World

Output:
"Hello World" is not a Palindrome
*/

import java.util.Scanner;

public class Q4_PalindromeStringCheck {

    public static boolean isPalindrome(String s){
        if (s == null){
            return false;
        }

        s= s.trim();
        if (s.isEmpty()){
            return true;
        }

        int left = 0;
        int right = s.length() - 1;
        while (left < right){
            /* So it skips everything that is NOT a letter or number:

                    spaces → skipped

                    commas → skipped

                    dots → skipped

                    symbols (! @ # $) → skipped */

            while (left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            char chLeft = Character.toLowerCase(s.charAt(left));
            char chRight = Character.toLowerCase(s.charAt(right));

            if (chLeft != chRight){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        sc.close();
        boolean result = isPalindrome(str);
        if (result){
            System.out.println("\"" + str + "\" is Palindrome");
        }else {
            System.out.println("\"" + str + "\" is not a Palindrome");
        }
    }
}