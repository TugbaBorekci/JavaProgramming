package Week06_15_10_2022;

public class T1_CountSpecificWord {
    public static void main(String[] args) {
       /*
       Task 1: Given a sentence which is string find word how many times repeats in it.

Hint: use substring with for loop

input:
*                                String str="Java is java in everywhere is Java";
*                                String word="Java";
output:3
        */

        String str =  "Java is Java in everywhere is Java";
        String word = "Java";
        int counter=0;
        for (int i = 0; i < str.length()-word.length(); i++) {
            String each = str.substring(i, i + word.length());
            if (each.equalsIgnoreCase(word))
            counter++;//if we have only one statement after if clouse we dont need to use curlybraces{}
        }
        System.out.println(counter);
    }
}

//benim sonuc niye 2 cikti hocanin sonuc 3