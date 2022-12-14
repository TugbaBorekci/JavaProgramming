package day20_Arrays;

import java.util.Arrays;

public class ArraysBackWordAlphabet {
    public static void main(String[] args) {

        char[] alphabets = new char[26]; // Z~A

         /*
       //this is long way not usefull
        alphabets[0] = 'Z'; //ASCII table all character has number Z=90
        alphabets[1] = 'Y'; //ASCII table all character has number Z=89
        alphabets[2] = 'X'; //ASCII table all character has number Z=88

        System.out.println(Arrays.toString(alphabets));//print to whole array
        System.out.println(alphabets[0]);//printing the element of array
       */

        //best way for loop
        char ch = 'Z';
        for (int i = 0; i < alphabets.length; i++, ch--) {
          alphabets[i] = ch;
        }
        System.out.println(Arrays.toString(alphabets));
       //for loop 1.yol yapildi

        }

    }


