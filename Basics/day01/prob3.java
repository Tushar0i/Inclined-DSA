import java.util.Scanner;


public class prob3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
         *Entercostof3itemsfromtheuser(usingfloatdatatype)-apencil
         ,apenandan eraser. You have to output the total cost of the
          items back to the user as their bill.(Add on : You can also 
          try adding 18% gst tax to the items in the bill as an advanced
           problem)
         */


        float pencil;
        float pen;
        float eraser;

        System.out.print("Enter the price of pencil: ");
        pencil = scanner.nextFloat();
        System.out.print("Enter the price of pen: ");
        pen = scanner.nextFloat();
        System.out.print("Enter the price of erasr: ");
        eraser = scanner.nextFloat();

        float subTotal = pen+pencil+eraser;
        float tax = subTotal*18/100;

        System.out.println("-----------------------------------");
        System.out.println("pencil price : "+pencil);
        System.out.println("pen price    : "+pen);
        System.out.println("eraser price : "+eraser);
        System.out.println("Subtotal     : "+subTotal);
        System.out.println("18% tax      : "+tax);
        System.out.println("Total amount you have to pay : "+ (subTotal+tax));
        System.out.println("-----------------------------------");

        scanner.close();
    }
}
