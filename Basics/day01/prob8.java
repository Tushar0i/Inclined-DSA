public class prob8 {
    public static void main(String[] args) {
        System.out.println("Just for test purpose");

        // stair
        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        // inverted stair

        for (int i = 4; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        // half piramid

        /*
         * 1
         * 12
         * 123
         * 1234
         * 12345
         * 123456
         */

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // charactor pattern
        /*
         * A
         * BC
         * DEF
         * GHIJ
         * KLMNO
         */


         char ch ='A';

         for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
         }

    }

}
