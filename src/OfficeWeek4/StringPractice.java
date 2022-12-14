package OfficeWeek4;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {

        String s1 = "hat";
        String s2 = new String("hat");

        System.out.println(s1.equals(s2));//true
        System.out.println(s1 == s2);//false

        String s3 = "hat";
        System.out.println( s1 == s3);//true

        s3 ="bag";
        System.out.println(s3);

        checkLength();
        trimMethod();
        indexOfMethod();
        substringMethod();
            nameGenerated();

    }

    public static void checkLength() {
        System.out.println("house".length());//5
        System.out.println("house".charAt(0));//h
        System.out.println("How much is the length of this **** statement?".length());
    }
    public static void trimMethod(){
        System.out.println("  This is a   .trim method, practice . ".trim());//bastaki ve sondaki boslugu siler sadece
        System.out.println("  This is a   .trim method, practice . ".replace(" ", ""));//butun space leri silmek icin

    }

    public static void indexOfMethod(){

        String data = "Hello, World";
        System.out.println(data.indexOf("o"));//4
        System.out.println(data.lastIndexOf("o"));//
        char o = 'o';
        String o1 = "o";

    }
    public static void substringMethod(){
        String data ="This is substring practice";
        String subData1 = data.substring(5);//"is substring practice" yazdirir. yazdirmaya nereden basliyacagini soyluyor ve sonuna kadar yazdiriyor
        String subData2 = data.substring(5,10);//not include ending index "is su" yazdirir.nerden baslayip nereye kadar yazdiracagini soyluyor
        System.out.println(subData1);
        System.out.println(subData2);
    }

    public static void isEmptyBlank(){
        String data = "";
        String data1 = " ";
        System.out.println(data.isEmpty());//false
        System.out.println(data1.isEmpty());//true

        System.out.println(data.isBlank());//true
        System.out.println(data1.isBlank());//true
    }

    public static void egualIsMethod(){
        String Data = "PRACTICE";
        String data = "practice";
        System.out.println(Data.equals(data));
        System.out.println(Data.equalsIgnoreCase(data));

    }

    public static void nameGenerated(){

        String firstName = "Robert";
        String middleName ="Down";
        String lastName = "Junior";

      String name = "Robert Down Junior";
        System.out.println(firstName.substring(0,1)+"."+middleName.substring(0,1)+"."+lastName.substring(0,1));//R.D.J


    }
}

