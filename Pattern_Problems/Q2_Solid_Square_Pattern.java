import java.util.Scanner;

<<<<<<< HEAD
/* Pattern-2
        * * * * *
        * * * * *
        * * * * *
        * * * * *
        * * * * *
                    */


=======
>>>>>>> 4925cab03242f9a49405027191dcb3af92a07ca7
public class Q2_Solid_Square_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of Rows: ");
        int n = sc.nextInt();

        pattern2(n);
    }

    static void pattern2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
