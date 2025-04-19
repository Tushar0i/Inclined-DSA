public class prob4 {
    public static void main(String[] args) {
        // printing a sub array

        int numbers[] = { 1, 3, 5, 7, 9 };

        printSubArray(numbers);

    }

    public static void printSubArray(int num[]) {

        int noOfSubarray = 0;
    
        
        for (int i = 0; i < num.length; i++) {
            
            int start = i;
            for (int j = i; j < num.length; j++) {
                
               
                int end = j;
                for (int j2 = start; j2 <= end; j2++) {
                    
                    
                    System.out.print(num[j2] + " ");
                
                }
                
                noOfSubarray++;

                System.out.println();

            }
            System.out.println();

        }

        System.out.println("No of total subarray = " + noOfSubarray);

    }
}
