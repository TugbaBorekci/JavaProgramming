package Week04_10_2022;

public class CodilityTestCoders {

    public static void main(String[] args) {
        //we will get one number from the user (create a veriable) positive
        int number =6;

        //we will create a veriable in order to put our result in it
        String result = "";

        //we will check the number is positive or negative
        if (number > 0) { // I can go on
            //I can go on the other steps

            // if the number is positive we will check the number divisable by 2 we put the codility inside veriable
        if (number % 2 == 0){
            result = "Codility";
            }
            // if the number is positive we will check the number divisable by 3 we put the codility inside veriable

        if (number % 3 == 0){
            result+="Test";
        }

            // if the number is positive we will check the number divisable by 5 we append the Coders inside veriable
            if (number % 5 == 0){
                //result = result+"Coders";
                result+="Coders";

            }else {
                System.out.println("invalid or the number is not divisible 2 or 3 or 5");

            }

        }else{
            System.out.println("Your number is smaller than 0");
        }
        System.out.println("result = " + result);

    }
}
/*
Task 1:
        Write a function:
        that, given a positive integer N  However, any number divisible by 2, 3 or 5 should be replaced by the word

        Codility -- 2
        Test     -- 3
        Coders   -- 5

        - If a number is divisible by more than one of the numbers:2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order.

        EXPECTED

        numbers divisible by both 2 and 3 should be replaced by CodilityTest
        INPUT : 6    OUTPUT :  CodilityTest

        numbers divisible by allthree numbers: 2,3 and 5, should be replaced by CodilityTestCoders.
        INPUT : 30    OUTPUT :  CodilityTestCoders
 */
