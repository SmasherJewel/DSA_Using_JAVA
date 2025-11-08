/*
Question:
Write a Java program to convert a distance from kilometers to miles.

The program should:
1. Ask the user to enter the distance in kilometers.
2. Convert the distance into miles using the formula:
      miles = kilometers * 0.621371
3. Display the converted distance in miles.

Example:
Input:
Enter Distance into Miles:
10
Output:
10.0 Kilometer: 6.21371
*/

// Optimized Solution

import java.util.Scanner;

public class Q14_KilometersToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        float km = sc.nextFloat();
        sc.close();

        float miles = km * 0.621371f;
        System.out.println(String.format("%.2f kilometers = %.2f miles", km, miles));
    }
}
