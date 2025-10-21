import java.util.Scanner;

/* Pattern-18

    A
   A B
  A B C
 A B C D
A B C D E

 */

public class Q18_Pyramid_AlphabeticPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of Rows: ");
        int n = sc.nextInt();

        pattern18(n);
    }
    static void pattern18(int n){
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i ; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print((char) ('A' + j) + " ");
            }
            System.out.println();
        }
    }
}
