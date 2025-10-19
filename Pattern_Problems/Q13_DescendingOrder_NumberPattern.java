import java.util.Scanner;

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
