import java.util.Scanner;

public class prob11 {

    public static void main(String[] args) {
        // print a butterfly pattern

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number:");
        int a = scanner.nextInt();
        pattern(a);
        scanner.close();
    }

    public static void pattern(int a) {

      
        for (int i = 1; i <= a; i++) {
            
            for (int k = 1; k <= a-i ; k++) {
                System.out.print("  ");
                
            }
            for (int j = 1; j <= a; j++) {
                System.out.print("* ");
            }
           
            System.out.println();
        }


    }
}