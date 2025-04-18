import java.util.Scanner;

public class array3 {

    public static void main(String[] args) {
        // liner search 

        Scanner sc = new Scanner(System.in);

        int numbers[] = new int[1000];
        int a = 2 ;
        for (int i = 0; i < numbers.length; i++) {

            numbers[i]= a;

            a+=2;
        }

        System.out.print("Enter a number that you want to find: ");
        int key = sc.nextInt();


        int out =  linerSearch(numbers, key);
        

        if ( out  == -1) {
            System.out.println("Not found");
        }else{

            System.out.println("Found at index "+out +" = "+key);
        }




        sc.close();
    }

    public static int linerSearch( int number[] ,int key){


        System.out.println("Searching...............");
        for (int i = 0; i < number.length; i++) {
            if ( number[i]== key) {
                return i;
            }
            
             
        }


        return -1;
    }
    
}