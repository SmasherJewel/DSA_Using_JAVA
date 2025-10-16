import java.util.Scanner;

/*

A
B B
C C C
D D D D
E E E E E
F F F F F F

 */

public class Q8_Alphabet_Repetition_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of Rows: ");
        int n = sc.nextInt();

        pattern8(n);
    }

    static void pattern8(int n){

        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
