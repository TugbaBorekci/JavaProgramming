package week11_05_2022;

public class Task1_EvenOrOdd {

    public static void main(String[] args) {
     /*
     Task 1 :   Write a method that can check if a number is even or odd
      */

        checkNumberEvenOrOdd(5);
        checkNumberEvenOrOdd(10);
        checkNumberEvenOrOdd(18);
        checkNumberEvenOrOdd(3);
    }

    public static void checkNumberEvenOrOdd(int number){
        if(number%2==0){
            System.out.println(number + " is even");
        }else{
            System.out.println(number + " is odd");
        }
    }
}
