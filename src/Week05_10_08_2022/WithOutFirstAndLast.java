package Week05_10_08_2022;

import java.util.Scanner;

public class WithOutFirstAndLast {
    public static void main(String[] args) {
     /*
     Task 3: Given a string, return a version without the first and last char, so "Hello" yields "ell".
      Hint: The string length will be at least 2.
      */


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a word");
        String word= scanner.next();
        String result="";
        if (word.length()<=2){
            result=word;

        }else {
            result=word.substring(1,word.length()-1);
        }
        System.out.println(result);

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
