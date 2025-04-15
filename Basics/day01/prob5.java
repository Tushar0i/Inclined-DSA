import java.util.Scanner;


public class prob5 {
    public static void main(String[] args) {
        /*
         * Write a Java program to 
         * input week number (1-7) and 
         * print day of week name using switch case
         */
        Scanner scanner = new Scanner(System.in);

         int num;
         System.out.print("Enter week number(1-7): ");

         num = scanner.nextInt();

         switch(num){
             case 1 -> System.out.println("Monday");
             case 2 -> System.out.println("Tuesday");
             case 3 -> System.out.println("Wednesday");
             case 4 -> System.out.println("Thursday");
             case 5 -> System.out.println("Friday");
             case 6 -> System.out.println("Saturday");
             case 7 -> System.out.println("Sunday");

             default -> System.out.println(" Enter a valid number!!");
         }






         scanner.close();
    }
}
