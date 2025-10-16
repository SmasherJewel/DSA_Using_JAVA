import java.util.Scanner;

/* Pattern-3
        * * * * *
        * * * *
        * * *
        * *
        *
                */

public class Q3_Inverted_Right_Angled_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of Rows: ");
        int n = sc.nextInt();

        pattern3(n);
    }

    static void pattern3(int n){
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
