import java.util.Scanner;

/* Pattern-13
        5
        5 4
        5 4 3
        5 4 3 2
        5 4 3 2 1

 */

public class Q13_DescendingOrder_NumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of Rows: ");
        int n = sc.nextInt();

        pattern13(n);
    }
    static void pattern13(int n){
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= i ; j--) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
