import java.util.Scanner;

public class prob2 {

    public static void isEven(int a){

        if (( a%2 == 0)) {
            System.out.println("True! even ");
        } else {
            System.out.println("False! not even");
        }
        
    }
    public static void main(String[] args) {
        /*Write a method named isEven that accepts an int argument.
        The method should return true if the argument 
        is even,or false otherwise.Also write 
        a program to test your method */

        Scanner sc = new Scanner(System.in);

        int a;
        System.out.print("Enter number: ");
        a = sc.nextInt();

        System.out.println("Checking Even or not! ");

        isEven(a);


        sc.close();
    }
}
