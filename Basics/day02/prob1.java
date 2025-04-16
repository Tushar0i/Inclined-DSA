import java.util.Scanner;

public class prob1{

    public static double avg(double a, double b, double c){ 

        double avg = (a+b+c)/3;

        return avg;
    }

    public static void main(String[] args) {
        /*Write a Java method to compute the average of three numbers. */

        Scanner sc = new Scanner(System.in);

       
        double  a , b, c ;

        System.out.print("Enter first number : ");
        a = sc.nextDouble();

        System.out.print("Enter second number : ");
        b = sc.nextDouble();

        System.out.print("Enter third number : ");
        c = sc.nextDouble();

        double average = avg(a,b,c);

        System.out.println(average);

        sc.close();

    }
}