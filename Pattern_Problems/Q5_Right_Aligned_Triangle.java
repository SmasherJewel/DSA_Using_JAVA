import java.util.Scanner;

/* Pattern-5:
                *
               **
              ***
             ****
            *****   */


public class Q5_Right_Aligned_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of Rows: ");
        int n = sc.nextInt();

        pattern5(n);
    }

    static void pattern5(int n){
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n-i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
