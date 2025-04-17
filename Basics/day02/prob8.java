import java.util.Scanner;

public class prob8 {
    public static void main(String[] args) {
        /* Print floid's triangle */

        // 1
        // 2  3
        // 4  5  6
        // 7  8  9 10

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int a = sc.nextInt();

        triangle(a);

        sc.close();
    }
    public static void triangle(int a){

        int num = 1;
        for (int i = 1; i <=a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num+"   ");
                num++;
            }
            System.out.println();
        }
        
    }
}
