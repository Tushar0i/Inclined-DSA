public class prob5 {
    public static void main(String[] args) {
        // printing a  Max sub array sum and Min sub array sum
        // brute force

        int numbers[] = { -1,-3,23,5,4,9,-7,14,31,-9};

        printSubArraySum(numbers);

    }

    public static void printSubArraySum(int num[]) {

        int noOfSubarray = 0;
    
        int max = Integer.MIN_VALUE;

        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < num.length; i++) {
            
            int start = i;
            for (int j = i; j < num.length; j++) {
                
               
                int end = j;
                int sum = 0 ;
                for (int j2 = start; j2 <= end; j2++) {
                    
                
                    System.out.print(num[j2]+" ");
                    sum = sum + num[j2];
                
                }
                
                if (max< sum) {
                    max = sum;
                }

                if (min > sum) {
                    min = sum;
                }

                // System.out.println(sum);
                
                noOfSubarray++;

                System.out.println();

            }
            System.out.println();

        }

        System.out.println("min sub array sum = " +min);
        System.out.println("max sub array sum = "+max);
        System.out.println("No of total subarray = " + noOfSubarray);

    }
}
