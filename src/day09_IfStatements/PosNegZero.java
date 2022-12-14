package day09_IfStatements;

import java.util.SortedMap;

public class PosNegZero {
    public static void main(String[] args) {

        int n = 100;

       if ( n > 0) {
           System.out.println("Positive");
       }

       if ( n < 0) {
           System.out.println("Negative");
       }

       if ( n == 0) {
           System.out.println("Zero");
       }

        System.out.println("-------------------------------------------");
        boolean positive = n > 0;
        boolean negative = n < 0;
        boolean zero = n == 0;

        if (positive) {
            System.out.println( "Positive");
        } else if (negative) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        System.out.println("-------------------------------------------");

        //multi-branch if statements correct way
        if (positive) {
            System.out.println( "Positive");
        }
        if (negative) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    // if & else statement we can NEVER apply for the task that requires more than two condition!!!




        /*
        1. Maximum number between two different numbers
		2. Minimum number between two different numbers
		3. Write a program that can check if the person is eligible to buy alcohol
		4. Write a program that can check if the person is eligible to vote
         */


    }
}
