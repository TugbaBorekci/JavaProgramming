package Week06_15_10_2022;

public class WarmUpTask {

    public static void main(String[] args) {
/*
- Given a non-empty string like "Code" print a string like below output.

 *                                 Code → "CCoCodCode"
 *                                 abc → "aababc"
 *                                 ab → "aab"
 */

        String word = "Code";
               //index=0123

        String temp ="";

        for (int i = 0; i <= word.length(); i++){
            String str = word.substring(0,i);
            //System.out.println(str);
            temp += str;
        }


      //  System.out.println(temp+word);
        System.out.println(temp);

    }

}


