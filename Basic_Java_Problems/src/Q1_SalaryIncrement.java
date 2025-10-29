/*
Question:
Write a Java program to calculate and display the incremented salary of an employee
based on their performance rating.

The program should:
1. Ask the user to enter their current salary.
2. Ask the user to enter their performance rating (between 1.0 to 5.0).
3. Increase the salary according to the following criteria:
   - If rating is between 1.0 and 3.0 → Increase salary by 10%
   - If rating is greater than 3.0 and up to 4.0 → Increase salary by 25%
   - If rating is greater than 4.0 and up to 5.0 → Increase salary by 30%
4. Display the new incremented salary.
5. If the rating is outside the range 1.0 to 5.0, display “Invalid Input”.
*/

// Optimized Solution (Previous Logic is below after that solution)

import java.util.Scanner;

public class Q1_SalaryIncrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary,rating;
        System.out.println("Enter Your Current Salary: ");
        salary = sc.nextDouble();
        System.out.println("Enter Your Performance Rating (1.0 to 5.0): ");
        rating = sc.nextDouble();

        double incrementPercentage = 0.0;
        if (rating >= 1.0 && rating <= 3.0){
            incrementPercentage = 10;
        } else if (rating > 3.0 && rating <= 4.0) {
            incrementPercentage = 25;
        } else if (rating > 4.0 && rating <= 5.0) {
            incrementPercentage = 30;
        }
        else {
            System.out.println("Invalid Input");
            return;
        }

        double newSalary = salary + (incrementPercentage * salary / 100);
        System.out.println("Your Incremented Salary is : " + String.format("%.2f",newSalary));
    }
}



// Previous Logic for that (but not an optimized solution)

/*import java.util.*;

public class Q1_SalaryIncrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary, sal1, sal2, sal3;
        int result1, result2, result3;
        double rating;

        System.out.println("Please Enter Your Salary: ");
        salary = sc.nextInt();
        System.out.println("Enter Your Rating Between (1.0 to 5.0)");
        rating = sc.nextDouble();

        if (rating >= 1.0 && rating <= 3.0) {
            sal1 = (salary / 100) * 10;
            result1 = sal1 + salary;
            System.out.println("Your Incremented Salary is: " + result1);
        } else if (rating > 3.0 && rating <= 4.0) {
            sal2 = (salary / 100) * 25;
            result2 = sal2 + salary;
            System.out.println("Your Incremented Salary is: " + result2);
        } else if (rating > 4.0 && rating <= 5.0) {
            sal3 = (salary / 100) * 30;
            result3 = sal3 + salary;
            System.out.println("Your Incremented Salary is: " + result3);
        }else {
            System.out.println("Invalid Input");
        }
    }
}*/
