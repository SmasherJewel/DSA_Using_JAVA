import java.util.Scanner;

public class Q14_Downward_AlphabeticTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of Rows: ");
        int n = sc.nextInt();

        pattern14(n);
    }
    static void pattern14(int n){
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print((char) ('A' + j) + " ");
            }
            System.out.println();
        }
    }
}
