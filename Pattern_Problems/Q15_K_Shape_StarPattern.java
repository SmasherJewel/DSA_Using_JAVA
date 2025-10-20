import java.util.Scanner;

/* Pattern-15
        *****
        ****
        ***
        **
        *
        *
        **
        ***
        ****
        *****

 */

public class Q15_K_Shape_StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of Rows: ");
        int n = sc.nextInt();

        pattern15(n);
    }

    static void pattern15(int n){
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Reverse Portion
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
