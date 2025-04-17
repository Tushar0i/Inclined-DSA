import java.util.Scanner;

public class array1{
    public static void main (String[] args) {
        
        // In this I learned about arrays.

        Scanner sc = new Scanner(System.in);

        int marks[] = new int[50];

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();


        System.out.println("mark at index 0: "+marks[0]);
        System.out.println("mark at index 1: "+marks[1]);
        System.out.println("mark at index 2: "+marks[2]);
        System.out.println("mark at index 9: "+marks[9]);


        marks[1] = 9;
        System.out.println("marks at index 1: "+marks[1]);

        marks[2] = marks[2] / 10;
        System.out.println("marks at index 2: "+marks[2]);

      
        sc.close();
    }
}