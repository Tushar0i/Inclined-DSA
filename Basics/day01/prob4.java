import java.util.Scanner;

public class prob4 {
    public static void main(String[] args) {

        /*
         * Write a program that reads a set of 
         * integers,and then prints the sum 
         * of the even and odd integers.
         */

        Scanner scanner = new Scanner(System.in);

        int noOfElement = 0;
        int sumOfEven = 0;
        int sumOfOdd = 0;
        int num = 0;

        System.out.print("Enter the number of elements in set: ");
        noOfElement = scanner.nextInt();

        for (int i = 1; i <= noOfElement; i++) {

            System.out.print("Enter your number"+i+":");
            num = scanner.nextInt();

            if (num % 2 == 0) {

                sumOfEven += num;
            } else {
                sumOfOdd += num;
            }

        }
        System.out.println("Sum of even numbers is:" + sumOfEven + ", Sum of odd numbers is:" + sumOfOdd);

        scanner.close();
    }
}
