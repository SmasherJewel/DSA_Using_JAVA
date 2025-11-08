/*
Question:
Write a Java program to encrypt and decrypt a student’s grade using basic character shifting.

The program should:
1. Ask the user to enter a single grade character (A to F).
2. Validate that the entered character is within the range A–F or a–f.
3. Encrypt the grade by adding a key value (e.g., 8) to its character code.
4. Decrypt the grade by subtracting the same key value from the encrypted character.
5. Display the original grade, the encrypted grade, and the decrypted grade.

Example:
Input:
Enter Your Grade (A to F): A
Output:
Grade is: A
Encrypted Grade is: I
Decrypted Grade is: A
*/

// Optimized Solution

import java.util.Scanner;

public class Q15_EncryptDecryptGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char grade = ' ';
        int key = 8;

        while (true){
            System.out.print("Enter your grade (A to F): ");
            String input = sc.next();

            if (input.length() == 1){
                grade = input.charAt(0);
                if ((grade >= 'A' && grade <= 'F') || (grade >= 'a' && grade <= 'f')){
                    break;
                }else {
                    System.out.println("Invalid Grade! Please enter only A to F.\n");
                }
            }else {
                System.out.println("Please enter only one character.\n");
            }
        }
        sc.close();

        char encryptedGrade = (char) (grade + key);
        char decryptedGrade = (char) (encryptedGrade - key);

        System.out.println("\n--- Encryption Results ---");
        System.out.println("Original Grade: " + grade);
        System.out.println("Encrypted Grade: " + encryptedGrade);
        System.out.println("Decrypted Grade: " + decryptedGrade);
    }
}
