package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {

        char[] letters = new char[26];
        /*
letters[0] = 'A';
letters[1] = 'B';
letters[2] = 'C';
letters[3] = 'D';
 */
        /*
        //for loop kullanmak lazim daha easy 26 harfi tek tek yazmak uzun

        for (char i = 'A', j = 0; i <= 'Z' && j < letters.length; i++, j++) {
            letters[j]=i;
        }

        System.out.println(Arrays.toString(letters)); //[A~Z]
*///for loop 1. yol yapildi forword

        /*
       //baska bir yol

        for(int i = 0, j = 'A'; i <letters.length; i++, j++) {//i: index numbers 0~last index
            letters[i]=(char)j;
        }

        System.out.println(Arrays.toString(letters)); //[A~Z]
         *///for loop 2.bir yol yapildi forword

        /*
//baska bir yol
char ch = 'A';
for (int i  = 0,  i < letters.length; i++, j++) {
            letters[i]=ch;
        }

        System.out.println(Arrays.toString(letters)); //[A~Z]
*///for loop 3. yol yapildi forword



//baska bir yol

        char ch = 'A';
        for (int i = 0; i < letters.length; i++, ch++) {
            letters[i]=ch;

        }
        System.out.println(Arrays.toString(letters)); //[A~Z]
//for loop 4. yol yapildi forword



        }
    }

