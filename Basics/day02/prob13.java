import java.util.Scanner;

public class prob13 {

    public static void main(String[] args) {
        // print a diomond pattern

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number:");
        int a = scanner.nextInt();
        pattern(a);
        scanner.close();
    }

    public static void pattern(int a) {

        for (int i = 1; i <= a; i++) {

            for (int j = 1; j <= a-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int i = a; i >= 1; i--) {

            for (int j = 1; j <= a-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}