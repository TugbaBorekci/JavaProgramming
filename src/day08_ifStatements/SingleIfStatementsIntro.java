package day08_ifStatements;

public class SingleIfStatementsIntro {
    public static void main(String[] args) {

        int number = 101;

        /*
        System.out.println("Odd Number");
        System.out.println("Even Number");
         */
        boolean evenNumber = number%2 == 0;
        boolean oddNumber = ! evenNumber; // not even number

       if (evenNumber) { // even number
           System.out.println(number+ " is even number");
       }

        if  (oddNumber) { //odd number
            System.out.println(number+" is odd number" );

        }

        System.out.println("--------------------------------");

        int n = 200;

        // positive
        if  (n > 0) { // if the n is greater  than zero it is positive number
            System.out.println(n + " is positive");
        }

        // negative
        if  (n < 0) { // if n is less than zero, then it is negative

            System.out.println(n + " is negative");
        }
        //zero
        if (n == 0) {

            System.out.println(n + " is zero");

        }


    }
}
