public class prob02 {
    public static void main(String[] args){

        // reverse an array 
        // wan can make another array and than solve it but this is the efficient way
        int numbers[] = {1,12,3,34,3,5,2,3,23,23,7,554,2,2,2,232,1312,45,332,87,544,90,11,212,533,} ;


        reverse(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");

        }

        System.out.println();



    }
    public static void reverse(int num[]){

    
        int first = 0 , last = num.length - 1;
       
        while (first < last) {
            
            int temp  = num[last];
            num[last] = num[first];
            num[first] = temp;

            first++;
            last--;
        }


        
        
    }

}
