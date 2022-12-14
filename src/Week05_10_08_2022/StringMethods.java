package Week05_10_08_2022;

import java.util.Scanner;

public class StringMethods {

    public static void main(String[] args) {
        //if we use specific character we use charAt();
        String str = "Adam";
          //character 0123
        System.out.println(str.charAt(0));//first character
        System.out.println(str.charAt(3));//third character
        //which character you want give it number.number start(0)
        System.out.println(str.length());//toplamda kac karakter oldugu

        //how we get last character
        int lengthOfTheString = str.length();
        int indexOfLastChar = lengthOfTheString-1;
        System.out.println(str.charAt(indexOfLastChar));

        //in order to make letters lower case toLowerCase
        System.out.println(str.toLowerCase());

        //in order to make letters upper case toUpperCase
        System.out.println(str.toUpperCase());

        //in order to remove spaces before and after your string trim()
        String str1="    Adam    ";
        System.out.println(str1.trim());

        System.out.println(str1);// we will spaces in here because String is immutable

        //if you want to get index of char or string we need to use indexOf() method
        String number = "0123456";
        //get the index of 3
        System.out.println(number.indexOf('3'));// index of 3 is three
        //get the index of 34
        System.out.println(number.indexOf("34"));// index of 3 4 is
        System.out.println(number.indexOf("56"));// index of 5 6 is
        System.out.println(number.indexOf("14"));// index of 1 4 is
        //it will return -1 means that there is no 1 4 in that string

        String sentence="Java is a programming language";
                       //0123456789
        System.out.println(sentence.indexOf(" programming "));//bosluk birakirsak resul 9.
        System.out.println(sentence.indexOf("programming"));//bosluk birakmazsak result 10

        String sentence1="Java is Java";
        System.out.println(sentence1.indexOf("Java"));//return me 0
        System.out.println(sentence1.lastIndexOf("Java"));//return me 8

        //if we want to replace some part of the string we need to use replace or replaceFirst
        String sentence3="Java is a hard prog language";
        System.out.println(sentence3.replace("hard","easy"));
        System.out.println(sentence3.replace("hard","fun"));

        String sentence4="Java is not same with Java";
        System.out.println(sentence4.replaceFirst("Java","c#"));


        //if we want to check our string is empty or not we need to use isEmpty() method
        String emptyWord=" ";//isEmpty method is checking length
        System.out.println(emptyWord.isEmpty());

        //if we want to check our string is blank or not we need to use isBlank() method
        String blankWord="    ";//it is checking spaces
        System.out.println(emptyWord.isBlank());

        //if we want to compare two sharing values without exact matching(lower case or upper case )we can use
        //equalIgnoreCase()

        String str6="Word";
        String str7="word";
        System.out.println(str6.equals(str7));
        System.out.println(str6.equalsIgnoreCase("str7"));

        //startsWith() method is using for checking the string is starting with given char sequence or not
        //startsWith() method is using for checking the string is starting with given char sequence or not
        String sentence5="Java is a good language";
        System.out.println(sentence5.startsWith("Java"));

        System.out.println(sentence5.endsWith("language"));

        //contains method is using for checking the given char sequence is in string or not
        String sentence6="Java is Java";

    }

}
// Task 1: Given a string, print the string made of its first two chars,
// so the String "Hello" or "hello" yields “HE".