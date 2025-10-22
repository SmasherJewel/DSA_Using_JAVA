import java.util.Scanner;

/* Pattern-19

A B C D E
 A B C D
  A B C
   A B
    A

 */

public class Q19_ReversedPyramid_AlphabeticPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of Rows: ");
        int n = sc.nextInt();

        pattern19(n);
    }
    static void pattern19(int n){
        for (int i = n; i >= 1; i--) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print((char) ('A' + j) + " ");
            }
            System.out.println();
        }
    }
}
