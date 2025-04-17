import java.util.Scanner;

public class prob12 {

    public static void main(String[] args) {
        // print a hollow rombus pattern

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
            for (int j = 1; j <= a; j++) {
                if (i == 1|| i == a || j == 1 || j ==a) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
