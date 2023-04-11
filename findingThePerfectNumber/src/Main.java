public class Main {
    public static void main(String[] args) {
        /* A number whose sum of numbers dividing by
        itself is equal to itself is called a "perfect number".
            For example: 6 = 1+2+3
            For example: 28= 1+2+4+7+14
            For example: 496
            For example: 8128
         */

        int number = 496;
        int aggregate = 0;

        if (number < 1) {
            System.out.println("Please Enter Positive Integer");

        return;
        }

            for (int i = 1; i < number; i++)
                if (number % i == 0) {
                    aggregate = aggregate + i;
                }

            if (aggregate == number) {
                System.out.println( number+ " Is 'Perfect Number' ");
            } else {
                System.out.println( number+ " Is not 'Perfect Number' ");
            }
        }
    }