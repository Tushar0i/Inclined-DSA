import java.util.Scanner;

public class prob9 {
    public static void main(String[] args){
        // Print this pattern for n rows

        // 1
        // 01
        // 101
        // 0101
        // 10101
        // 010101

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of rows: ");
        int a = sc.nextInt();


        pattern(a);

        sc.close();
    }
    public static void pattern(int a){

        for (int i = 1; i <=a; i++) {
            for (int j = 0; j < i; j++) {
                // my logic ((i%2!=0 && j%2!=0 )||(i%2==0 && j%2==0 ))
                // optamised one
                if  ((i+j)%2==0){
                    System.out.print(0+" ");
                } else {
                    System.out.print(1+" ");
                }
            }
            System.out.println();
        }


    }
}
