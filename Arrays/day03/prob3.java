public class prob3{
    public static void main(String [] args){

        // pairs in an array


        int numbers[] = {2,3,4,6,9,11,21,43,54};

        printPairs(numbers);




    }
    public static void printPairs(int num[]){


        int totalp = 0;
        for (int i = 0; i < num.length; i++) {
            int curr = num[i];
            for (int j = i+1; j < num.length; j++) {
                System.out.print("("+ curr+","+num[j]+")  ");
                totalp++;
            }
            System.out.println();

        }
        System.out.println("Total no of pairs: "+totalp);




    }
}