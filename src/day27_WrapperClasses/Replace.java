package day27_WrapperClasses;

import java.util.Arrays;

public class Replace {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        arr = replace(arr, 2, 30); //arrayin icindeki 2. endexi 30 ile degisitir diyor
        System.out.println(Arrays.toString(arr));

        System.out.println("----------------------------------------------------------");

        double[] arr2 = {1.5, 2.5, 5.5,4.5};
        arr2 = replace(arr2, 2, 3.5);
        System.out.println(Arrays.toString(arr2));

        System.out.println("----------------------------------------------------------");

        char[] arr3 = {'A', 'B', 'M', 'D'};
        arr3 = replace(arr3, 2, 'C');
        System.out.println(Arrays.toString(arr3));

        System.out.println("----------------------------------------------------------");


        String[] arr4 = {"Java","Python", "C++", "Ruby"};
        arr4 = replace(arr4, 2, "C#");
        System.out.println(Arrays.toString(arr4));

        System.out.println("----------------------------------------------------------");

    }

    //                             arr = {1,2,3,4,5}    200,         30

    //replace the elements of the array at given index with the new array
    public static int[] replace(int[] array, int index, int newElement) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    //replace the elements of the array at given index with the new array
    public static double[] replace(double[] array, int index, double newElement) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);

        }

        array[index] = newElement;
        return array;

    }

    //replace the elements of the array at given index with the new array
    public static char[] replace(char[] array, int index, char newElement) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);

        }

        array[index] = newElement;
        return array;

    }

    //replace the elements of the array at given index with the new array
    public static String[] replace(String[] array, int index, String newElement) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);

        }

        array[index] = newElement;
        return array;

    }
}
/*
1. Replace Task:
		1.1 Create a method named replace that passes three parameters: integer array, integer index, integer newElement. The method replaces the element of the array at given index with the new element, and returns the new array.
				Ex:
					arr = {1,2,3,4,5};

					replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}

 */