import java.util.Scanner;

/* Pattern-9
    * * * *
     * * *
      * *
       *

 */

public class Q9_Downward_Triangle_Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of Rows: ");
        int n = sc.nextInt();

        pattern9(n);
    }
    static void pattern9(int n){
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
