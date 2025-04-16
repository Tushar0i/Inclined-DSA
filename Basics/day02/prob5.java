import java.util.Scanner;

public class prob5 {
    public static void main(String[] args) {
        // print a hollow rectangle with 4 row and 6 column

        Scanner scanner = new Scanner(System.in);

        int a,b;

        System.out.print("Enter number of rows: ");
        a = scanner.nextInt();
        System.out.print("Enter number of column: ");
        b = scanner.nextInt();

        hollowRectangle(a, b);

        scanner.close();
    }
    public static void hollowRectangle(int a , int b) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <=b; j++) {
                if (i==1||i==a||j==1||j==b) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
