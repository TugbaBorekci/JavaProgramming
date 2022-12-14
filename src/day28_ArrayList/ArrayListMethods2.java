package day28_ArrayList;

import utilities.ArraysUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);

       /* int num = 1;
        list.remove(num);
        System.out.println(list);//1. index 200 u remove yapti [100, 200, 200, 300, 400, 500]
       */

       /*
        Integer num = 200; //non-primitive element remove metod
        list.remove(num);//element object itself remove from Array list.buraya direkt 200 yazip remove yazamayiz IndexOutOfBoundsForLength uyarisi veri
        System.out.println(list);
        */

       // this method return type boolean
        Integer num = 2000;
        boolean r = list.remove(num);
        System.out.println(list);
        System.out.println(r);//2000 sayisi Array List te olmadigi icin false yazdiridi


        System.out.println("----------------------------------------------------------");

        // Clear method it clears everything remove all elements of the array list size will be [] 0

        System.out.println(list.size());//suan 7
        list.clear();
        System.out.println(list);//[] remove all the elements clear everthing [] bos kaldi 0 element yani size will be 0
        System.out.println(list.size());//size  0 oldu

        System.out.println("----------------------------------------------------------");

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a = characters.indexOf('A'); //0.index
        int b = characters.lastIndexOf('A');//4.index last index oluyor

        System.out.println(a);//0
        System.out.println(b);//4


        System.out.println("----------------------------------------------------------");

       boolean r2 = characters.contains('A'); //array list te 'A' characteri oldugu icin true
        System.out.println("r2 = " +r2);
       boolean r3 = characters.contains('Z');//array list te 'Z' characteri olmadigi icin false
        System.out.println("r3 = " +r3);

        System.out.println("----------------------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1 == list2);//false yazdirir.same number elements and same exact elements but two different array list they save new object different heap memory

        System.out.println(list1.equals(list2));//true yazdirir.elements leri ve index leri ayni oldugu icin bir tanesi degisirse false olur


        System.out.println("----------------------------------------------------------");

        //eger clear metotunu kullanirsak true cikar
        boolean r4 = list1.isEmpty(); //false
        System.out.println("r4 = " + r4);// cunku icinde element var

        list1.clear();//simdi list1 daki tum elementleri siliyoruz
        boolean r5 = list1.isEmpty();// r5 adinda boolean variable ina atama yapiyoruz ve empty() olup olmadigini kontrol ediyoruz
        System.out.println("r5 = " + r5); // tum elementleri sildi ve ekontrolu yapti evet suan bos o yuzden true yazdirdi

        System.out.println("----------------------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
      //Bulk Operation
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7)); //elementleri array list olarak yapmak icin
        System.out.println(numbers);//[1, 2, 3, 4, 5, 6, 7] elementleri array list olarak yazdirdi

    }
    }
