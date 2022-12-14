package week11_05_2022;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {

    public static void main(String[] args) {

        int[] firstArray = {1, 2, 3};
        int[] secondArray = {4, 5, 6};
        int[] thirdArray = {7, 8, 9, 10};

        int[][] twoDimensionArray = {
                //0 1 2
                {1, 2, 3},     //firstArray   index of that array 0
                {4, 5, 6},     //secondArray  index of that array 1
                //0 1 2 3
                {7, 8, 9, 10},  //thirdArray   index of that array 2
        };
        int[][] array2D = {{}, {}, {}}; //we can use like this
        //int[][] array2D={firstArray,secondArray,thirdArray} we can use like this

        System.out.println(twoDimensionArray[0][1]);//in order to reach 2 first we need to go to first array by using
        //index of array which is 0 then I need to gotothe that element by using index of element which is 1

        System.out.println(twoDimensionArray[2][2]);
        //3 row number
        for (int i = 0; i < twoDimensionArray.length; i++) { //that means how many array you have 2D array.in here order to go to array one by one

            System.out.println(i + ".array");
            //column numbers
            for (int j = 0; j < twoDimensionArray[i].length; j++) {//this is for finding element inside inner array
                System.out.println(twoDimensionArray[1][2]);
            }
            System.out.println("---------------------------------------------------");
        }

        int[][][] array3D = { // recording den bak tam bitmedi
                {
                        {1, 2, 3},
                        {4, 5, 6}
                },
                {
                        {1, 2, 3},
                        {4, 5, 6}

                }
        };
    }
}

