package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class MethodOverloading {
    public static void main(String[] args) {

        //Method Overloading: multiple different methods sharing the same method name, must be different parameters()

         int[] intArray = {5,6,0,-1,3,4};
         Arrays.sort(intArray);

         double[] doubleArray = {10.5,11.5,5.5,4.5};
         Arrays.sort(doubleArray);

         char[] charArray = {'E','F','B','C','A'};
         Arrays.sort(charArray);

        System.out.println("-----------------------------------------------");


        //sum of 10, 20
        int sum1 = sumOfNumbers(10,20);


        //sum of 10, 20, 30
        int sum2 = sumOfNumbers(10,20,30);

        //sum of 10, 20, 30, 40
        int sum3 = sumOfNumbers(10,20,30,40);

        //sum of 18.2, 30.7
        double sum4 = sumOfNumbers(18.2,30.7);

        //sum of 5.5, 4.5, 6.5
        double sum5 = sumOfNumbers(5.5, 4.5, 6.5);

        //sum of 2.5, 4.5, 6.5, 3.5
        double sum6 = sumOfNumbers(2.5, 4.5, 6.5, 3.5);


    }
    public static int sumOfNumbers(int num1, int num2){
        return num1 + num2;

    }

    public static int sumOfNumbers(int num1, int num2, int num3) {
        return sumOfNumbers(num1, num2) + num3;
    }

    public static int sumOfNumbers(int num1, int num2, int num3, int num4) {
        return sumOfNumbers(num1, num2, num3) + num4;// bu sekildede yazilabiliyor parantez icinde yazip sonra ekleme yapabiliriz

    }

     public static double sumOfNumbers(double num1, double num2){//Overloading method: can be different data type must be different parameter(double) but same method name(sumOfNumbers)
        return num1 + num2;
   }
    public static double sumOfNumbers(double num1, double num2, double num3) { //Overloading method: can be  different parameter(double) but same method name(sumOfNumbers)
        return num1 + num2 + num3;


    }
    public static double sumOfNumbers(double num1, double num2, double num3, double num4) { //Overloading method: can be  different parameter(double) but same method name(sumOfNumbers)
        return sumOfNumbers (num1, num2, num3) + num4;// bu sekildede yazilabiliyor
      }

}
/*
        1. create a method that can find the sum of two numbers
	                    method name: sumOf2Numbers

	    2. create a method that can find the sum of three numbers
	                    method name: sumOf3Numbers

	    3. create a method that can find the sum of four numbers
	                    method name: sumOf4Numbers
 */