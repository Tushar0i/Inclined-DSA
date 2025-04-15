import java.util.Scanner;

public class prob7 {
    public static void main(String[] args) {
        // Write a program to find the factorial of any number entered by the user.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a postive integer: ");
        int num = sc.nextInt();
        int fac = 1;


        if (num >= 0) {
            
            for (int i = num; i > 0; i--) {

            fac = fac*i;

            }
        
            System.out.println("Factorial of " + num + " is " + fac);
        
        } else {
            System.out.println("In valid input!");
        }



        sc.close();
    }
}
