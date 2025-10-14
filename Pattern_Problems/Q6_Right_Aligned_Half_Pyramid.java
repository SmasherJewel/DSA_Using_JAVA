import java.util.Scanner;

/* Pattern-6
                *
               * *
              * * *
             * * * *
            * * * * *

 */


public class Q6_Right_Aligned_Half_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of Rows: ");
        int n = sc.nextInt();

        pattern6(n);
    }

    static void pattern6(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
