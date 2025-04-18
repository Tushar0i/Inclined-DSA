import java.util.Scanner;

public class array4{
    public static void main( String[] args){


        // binary search 

        // we need an sorted array for binary search 
        Scanner sc = new Scanner(System.in);

        int numbers[] = new int[1000];
        int a = 2 ;
        for (int i = 0; i < numbers.length; i++) {

            numbers[i]= a;

            a+=2;
        }

        System.out.print("Enter a number that you want to find: ");
        int key = sc.nextInt();


        int out = binarySearch(numbers, key);


        if (out == -1) {
            System.out.println("Not Found! ");
        }else{
            System.out.println("Found at index "+out+" = "+key);
        }

        
        sc.close();
    }
    
    public static int binarySearch(int num[],int key){
        System.out.println("Searching .........");

        int start = 0, end = num.length-1;

        
        while (start <= end) {
            int mid =(start + end)/2;

            if (num[mid] == key) {
                return mid;
            }
            if (num[mid]< key) {
                start = mid+1;
            }
            else{
                end = mid-1;
            }
            
        }

        return -1;
    }

}