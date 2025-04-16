import java.util.Scanner;

public class prob4 {
    public static void main(String[] args) {
        /*Write a Java method to compute the sum of the digits in an integer*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter  a positive number: ");

        int num = sc.nextInt();

        if (num>0) {
            System.out.println(digitSum(num));
        } else {
            System.out.println("Invalid input!");
        }

        sc.close();

    }
    public static int digitSum(int num){

        int a = num;

        int sum = 0;
        

        while (a != 0) {
            
            int digit = a%10 ;

            sum = sum + digit;    

            a = a / 10 ;
        }


        return sum;
    }
}
