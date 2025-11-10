/*
Question:
In this challenge, we test the use of if-else conditional statements to automate decision-making.

Task:
Given an integer N, perform the following conditional actions:

1. If N is odd, print "Weird".
2. If N is even and in the inclusive range of 2 to 5, print "Not Weird".
3. If N is even and in the inclusive range of 6 to 20, print "Weird".
4. If N is even and greater than 20, print "Not Weird".

Input Format:
A single line containing a positive integer, N.

Output Format:
Print "Weird" if the number is weird; otherwise, print "Not Weird".

Example:
Input:
3
Output:
Weird

Input:
24
Output:
Not Weird
*/


import java.util.Scanner;

public class Q17_WeirdNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        
        if (n % 2 != 0){
            System.out.println("Weird");
        } else if (n >= 2 && n <= 5) {
            System.out.println("Not Weird");
        }else if (n <= 20){
            System.out.println("Weird");
        }else {
            System.out.println("Not Weird");
        }
    }
}
