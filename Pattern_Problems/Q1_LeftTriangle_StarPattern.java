import java.util.Scanner;

/* Pattern-1
        *
        * *
        * * *
        * * * *
        * * * * *
                        */

public class Q1_LeftTriangle_StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of Rows: ");
        int n = sc.nextInt();

        pattern1(n);
    }

    static void pattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
