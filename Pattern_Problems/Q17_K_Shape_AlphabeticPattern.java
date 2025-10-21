import java.util.Scanner;

/* Pattern-17
        ABCDE
        ABCD
        ABC
        AB
        A
        A
        AB
        ABC
        ABCD
        ABCDE

 */

public class Q17_K_Shape_AlphabeticPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of Rows: ");
        int n = sc.nextInt();

        pattern17(n);
    }
    static void pattern17(int n){
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print((char) ('A' + j));
            }
            System.out.println();
        }
        // Reverse Portion
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char) ('A' + j));
            }
            System.out.println();
        }
    }
}
