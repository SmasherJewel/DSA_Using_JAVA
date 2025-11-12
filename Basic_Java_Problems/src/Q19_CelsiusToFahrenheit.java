/*
Question:
Write a Java program to convert temperature from Celsius to Fahrenheit.

The program should:
1. Ask the user to enter temperature in Celsius.
2. Convert the Celsius temperature to Fahrenheit using the formula:
      F = (C * 9/5) + 32
3. Display the converted temperature in Fahrenheit with the °F symbol.

Example:
Input:
Enter temperature in Celsius: 0
Output:
32.0°F
*/

// Optimized Solution

import java.util.Scanner;

public class Q19_CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        sc.close();

        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(String.format("%.2f°C = %.2f°F", celsius, fahrenheit));
        // We can also use unicode
        /*System.out.println(String.format("%.2f\u00B0C = %.2f\u00B0F", celsius, fahrenheit));*/
    }
}
