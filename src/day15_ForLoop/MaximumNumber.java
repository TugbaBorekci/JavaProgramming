package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int max = -2147483648;// any number that user enter number will be enter greater than -2147483648
        // max = 12

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a number:");
            int num = scan.nextInt();

            if (num > max){
                max = num;
            }
        }
                System.out.println("max = " + max);




    }
}






/*
Write a program that asks the user to enter a number for 5 times.
Then I want to return the maximum number
 */