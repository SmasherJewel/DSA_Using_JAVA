import java.util.Scanner;

public class Q4_PalindromeStringCheck {

    public static boolean isPalindrome(String s){
        if (s == null){
            return false;
        }

        s= s.trim();
        if (s.isEmpty()){
            return true;
        }

        int left = 0;
        int right = s.length() - 1;
        while (left < right){
            /* So it skips everything that is NOT a letter or number:

                    spaces → skipped

                    commas → skipped

                    dots → skipped

                    symbols (! @ # $) → skipped */

            while (left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            char chLeft = Character.toLowerCase(s.charAt(left));
            char chRight = Character.toLowerCase(s.charAt(right));

            if (chLeft != chRight){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        sc.close();
        boolean result = isPalindrome(str);
        if (result){
            System.out.println("\"" + str + "\" is Palindrome");
        }else {
            System.out.println("\"" + str + "\" is not a Palindrome");
        }
    }
}