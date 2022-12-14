package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {
    public static void main(String[] args) {

        int[] arr = {10, 10, 20, 30, 40, 30, 30, 30};
        //            0   1   2   3   4   5   6   7  index number

        arr = replaceAll(arr, 30, 300);

        System.out.println(Arrays.toString(arr));

        System.out.println("----------------------------------------------");

        double[] arr2 = {1.5, 1.5, 2.5, 6.5, 1.5, 7.5,7.5};
        arr2 = replaceAll(arr2, 1.5, 3.5);
        System.out.println(Arrays.toString(arr2));

        System.out.println("----------------------------------------------");

        char[] arr3 = {'A','B', 'A', 'C', 'D','D', 'A', 'C'};
        arr3 = replaceAll(arr3, 'A', 'E');
        System.out.println(Arrays.toString(arr3));

        System.out.println("----------------------------------------------");

        String[] arr4 = {"Java", "Java", "Paython","Paython","C++","C#"};
        arr4 = replaceAll(arr4, "Python", "C#");
        System.out.println(Arrays.toString(arr4));



    }

    //replaces all the matching old valuee of the array with the new value
   public static int[] replaceAll(int[] array, int oldValue, int newValue){

       for (int i = 0; i < array.length; i++) {

           if (array[i] == oldValue){
               array[i] = newValue;
           }
       }
       return array;

   }

    //replaces all the matching old valuee of the array with the new value
    public static double[] replaceAll(double[] array, double oldValue, double newValue) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
        return array;

    }

    //replaces all the matching old valuee of the array with the new value
    public static char[] replaceAll(char[] array, char oldValue, char newValue) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
        return array;
    }

    //replaces all the matching old valuee of the array with the new value
    public static String[] replaceAll(String[] array, String oldValue, String newValue) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
        return array;
    }

}
/*
2. ReplaceAll Task:
		2.1 Create a method named replaceAll that passes three parameters: integer array, integer oldElement, integer newElement. The method replaces all the element of the array that matching with the given old element with the given new element, and returns the new array.
			Ex:
				arr = {10, 10, 20, 30, 40, 30, 30, 30};

				replaceAll(arr, 30, 300) ==> {10, 10, 20, 300, 40, 300, 300, 300}


		2.2 Create the same functions for double arrays, char arrays, and String arrays

 */