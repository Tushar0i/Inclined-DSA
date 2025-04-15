import java.util.Scanner;

public class prob6 {
    public static void main(String[] args) {
        /*
         * Write a Java program that takes a year from the
         * user and print whether that year is a leap year or not.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your year: ");
        int year = scanner.nextInt();

        // if (year % 4 == 0) {

        //     if (year % 100 == 0) {
        //         if (year % 400 == 0) {
        //             System.out.println(year + " is a leap year");
        //         } else {
        //             System.out.println(year + " is a not a leap year");
        //         }
        //     } else {
        //         System.out.println(year + " is a leap year");
        //     }
        // } else {
        //     System.out.println(year + " is a not a leap year!");
        // }
        // another approch

        boolean x = year % 4 == 0;
        boolean y = year % 100 != 0;
        boolean z = ((year % 400 == 0) && (year % 100 == 0));


        if(x && (y || z) ){
System.out.println(year+" is a leap year");
}
else{
    
    System.out.println(year+" is not a leap year");
        }

        scanner.close();
    }
}
