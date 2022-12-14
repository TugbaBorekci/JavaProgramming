package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

    public class NthLargestNumber {

        public static void main(String[] args) {

            ArrayList<Integer> list = new ArrayList<>();
            list.addAll(Arrays.asList(1,2,3,4,5,6,7, 7 ,8, 8));

            int n =3;

            for (int i = 1; i < n; i++) {//i=1 n=3 oldugu icin iki defa donucek max number metot.eger n=2 olsaydi 1 defa donucekti sonuc 7 olucakti.n=4 olsaydi 3 defa donucekti sonuc 5 olucakti
                list.removeIf( p -> Collections.max(list) == p);//removeIf metot ile ilk max number i buklcak cikaricak
            }

            int max = Collections.max(list);//Collaction utility class max()metot ile maximum number i bulabiliyoruz
                                                //sonra ilk max numbere bulup ikinci max numbere bulmasi icin removeIf()metodu nu kullanabiliriz max buldukca cikaricak ikinciye gecicek onu cikaricak ucuncuye gecicek

            System.out.println(max);//6


        }


    }
/*
1. write a program that can return the nth largest number from an arraylist
			arraylist = {1,2,3,4,5,6,7, 7 ,8, 8}
			n = 5
			output:
				4
 */