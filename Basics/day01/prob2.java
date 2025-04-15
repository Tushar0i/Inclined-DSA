import java.util.Scanner;

public class prob2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double side;

        System.out.print("Enter the length of side : ");

        side = scanner.nextDouble();

        System.out.println("Area of the square is :"+(side*side));



        scanner.close();
    }
}
