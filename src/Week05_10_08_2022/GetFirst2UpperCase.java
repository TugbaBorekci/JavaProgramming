package Week05_10_08_2022;

import java.util.Scanner;

public class GetFirst2UpperCase {
    public static void main(String[] args) {

        /*
        // Task 1: Given a string, print the string made of its first two chars,
        // so the String "Hello" or "hello" yields “HE".
         */
        Scanner scanner=new Scanner(System.in);
        //String word="Hello";
        System.out.println("enter a word");
                                     //01234
        String word = scanner.next();//Hello
        String result=word.charAt(0)+word.charAt(1)+"";//173
        String result2=""+word.charAt(0)+word.charAt(1);
        String result3=word.charAt(0)+""+word.charAt(1);
        System.out.println(result.toUpperCase());//173 double kod==> +"" sonda olunca sonuc
        System.out.println(result2.toUpperCase());//HE
        System.out.println(result3.toUpperCase());//HE same result with result2 double kodun==> +""  yeri degisti ama sonuc ayni



    }
}
