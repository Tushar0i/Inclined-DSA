
public class prob01  {
    public static void main(String[] args) {
        // finding the leargest in array;

        int numbers[] = {1,12,3,34,3,5,2,3,23,23,7,554,2,2,2,232,1312,45,332,87,544,90,11,212,533,} ;

        // Integer.MIN_VALUE -infinity for int
        
        int lar = leargest(numbers);
        int sma = smallest(numbers);

        System.out.println("Largest number in this array is "+lar);
        System.out.println("Smallest number in this array is "+sma);
        
    }
    public static int leargest( int num[] ){

        int a = Integer.MIN_VALUE;

        
        for (int i = 0; i < num.length; i++) {
            
            if (a < num[i]) {
                a = num[i];

            }
          


        }


        return a;
    }

    public static int smallest(int num[]){

        int a = Integer.MAX_VALUE;
        

        for (int i = 0; i < num.length; i++) {
            
            
          
            if (a>num[i]) {
                a = num[i];
            }


        }

        return a;

    }

}
