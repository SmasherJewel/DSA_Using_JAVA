import java.util.Scanner;

/* Pattern-7

A
A B
A B C
A B C D
A B C D E

 */

public class Q7_Right_Angled_Alphabet_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of Rows: ");
        int n = sc.nextInt();

        pattern7(n);
    }

    static void pattern7(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char)('A' + j) + " ");
            }
            System.out.println();
        }
    }
}
