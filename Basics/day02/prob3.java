import java.util.Scanner;

public class prob3 {

    public static void main(String[] args) {
        /*
         * Write a Java program to check if a number is a
         * palindrome in Java? (121 is a palindrome, 321 is not)
         */

        Scanner sc = new Scanner(System.in);

        int a;
        System.out.print("Enter your number : ");
        a = sc.nextInt();

        if (isPalindrome(a)) {
            System.out.println(a + " is a palindrome");
        } else {
            System.out.println(a + " is not a palindrome");

        }

        sc.close();
    }

    public static boolean isPalindrome(int a) {


        // Faced problem in creating logic for question;

        int num = a;
        int rev = 0;

        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;

        }
        if (a == rev) {
            return true;
        }
        return false;

    }
}
