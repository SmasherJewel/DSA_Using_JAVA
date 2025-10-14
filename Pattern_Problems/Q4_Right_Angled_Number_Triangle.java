import java.util.Scanner;

<<<<<<< HEAD
/* Pattern-4
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
                    */

=======
>>>>>>> 4925cab03242f9a49405027191dcb3af92a07ca7
public class Q4_Right_Angled_Number_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of Rows: ");
        int n = sc.nextInt();

        pattern4(n);
    }

    static void pattern4(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
