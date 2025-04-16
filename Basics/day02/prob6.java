import java.util.Scanner;

public class prob6 {
    public static void main(String[] args) {
        // print a inverted rotated half piramid

        Scanner sc = new Scanner(System.in);
       
        int a;
        System.out.print("Enter no of row: ");
        a = sc.nextInt();

        invP(a);


        sc.close();
    }


    public static void invP(int a){

        for (int i = 1; i <= a; i++) {
            for (int j = a; j >= i-1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
