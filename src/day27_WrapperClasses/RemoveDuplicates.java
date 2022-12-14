package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 4, 4, 4, 4};
        arr = removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("------------------------------------------");

        double[] arr2 = {1.5, 1.5,2.5, 5.5, 5.5, 2.5, 6.5,6.5};
        arr2 = removeDuplicates(arr2);
        System.out.println(Arrays.toString(arr2));

        System.out.println("------------------------------------------");

        char[] arr3 = {'A','B', 'A', 'C', 'D','D', 'A', 'C'};
        arr3 = removeDuplicates(arr3);
        System.out.println(Arrays.toString(arr3));

        System.out.println("------------------------------------------");

        String[] arr4 = {"Java", "Java", "Paython","Paython","C++","C#"};
        arr4 = removeDuplicates(arr4);
        System.out.println(Arrays.toString(arr4));
    }

    //removes the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int[] array) {

        int[] result = {}; //{1,2,3} birden fazla yazilanlari cikaricak

        for (int each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);

            }
        }
        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static double[] removeDuplicates(double[] array) {

        double[] result = {}; //{1,2,3} birden fazla yazilanlari cikaricak

        for (double each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);

            }
        }
        return result;


    }

    //removes the duplicates from the given array, returns the new array
    public static char[] removeDuplicates(char[] array) {

       char[] result = {}; //{1,2,3} birden fazla yazilanlari cikaricak

        for (char each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);

            }
        }
        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static String[] removeDuplicates(String[] array) {

        String[] result = {}; //{1,2,3} birden fazla yazilanlari cikaricak

        for (String each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);

            }
        }
        return result;
    }
}
