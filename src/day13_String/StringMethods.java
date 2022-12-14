package day13_String;


import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        String word = "Cydeo";
            //index: 01234
        char thirdChar = word.charAt(2);
        System.out.println("thirdChar = " + thirdChar);

       /* char tenthChar = word.charAt(9);
        System.out.println("tenthChar = " + tenthChar);
     */
        //if we give 4 it works because Cydeo indeks number 01234
      char tenthChar = word.charAt(4);
      System.out.println("tenthChar = " + tenthChar);


        System.out.println("---------------------------------------");


        String s1 = "Batch 25 is the best batch. Java Programming Language";

        int totalChars = s1.length();

        System.out.println("totalChars = " + totalChars);

        char lastChar = s1.charAt( s1.length()-1 ); //this is formula find last indext number
        System.out.println("lastChar = " + lastChar);

        System.out.println("---------------------------------------");

        String str = "wooden spoon";
        str = str.toUpperCase();  //"WOODEN SPOON"

        System.out.println(str);

        String s = "JAVA";
        s = s.toLowerCase();
        System.out.println(s);




    }

}
