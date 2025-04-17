import java.util.Scanner;

public class prob7 {
    public static void main(String[] args){
        /* Print this kind of pattern for n rows
         * 12345
         * 1234
         * 123
         * 12
         * 1
         */

         Scanner sc = new Scanner(System.in);

         System.out.print("Enter no of rows: ");
         int a = sc.nextInt();

         pattern(a);


        sc.close();
    }
    public static void pattern(int a){

        int row = a;

        // my intiatal logic
        // for (int i = 0; i < row; i++) {
        //     for (int j = 1; j <= row-i+; j++) {
        //         System.out.print(j);
        //     }
        //     for (int j = 0; j <= row-1; j++) {
        //         System.out.print(" ");
        //     }

        // System.out.println();
        // }


        
        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <= row-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }
}
