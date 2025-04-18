import java.util.Scanner;

public class array2 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        

        int marks[] = new int[20];

      
        inputLoop(marks);
        
        System.out.println("Updating every marks by one ! ");

        update(marks);


        outputLoop(marks);

        sc.close();
    }
    
    public static void inputLoop(int marks[]){
        int exit = 0;
        for (int i = 0; i < marks.length; i++) {

            System.out.print("Enter number at index "+i+" : ");

            marks[i] = sc.nextInt();

            System.out.println("to exit press 1 , to contine press 0");
            exit = sc.nextInt();
            if (exit == 1) {
                break;
            }
            else{
                System.out.println("contuning");
            }


        }
        
    }

    public static void update(int marks[]){

        for (int i = 0; i < marks.length; i++) {
             marks[i]+=1;
        }


    }

    public static void outputLoop(int marks[]){
        
        for (int i = 0; i < marks.length; i++) {
           
            System.out.println("Marks at index "+i+ " = "+marks[i]);
        }
    }



}
