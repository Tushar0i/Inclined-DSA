import java.util.Scanner;

public class prob1{

    public static void main(String [] args){

       Scanner scanner = new Scanner(System.in);

       double a;
       double b;
       double c;



       System.out.print("Enter number : ");

       a = scanner.nextDouble();

       System.out.print("Enter number : ");

       b = scanner.nextDouble();

       System.out.print("Enter number : ");

       c = scanner.nextDouble();
     

       double avg = (a+b+c)/3;

       System.out.println("Average of number is:"+ avg);

       
       System.out.println("exits");
    
       scanner.close();
    }
}