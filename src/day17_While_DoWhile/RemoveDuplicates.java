package day17_While_DoWhile;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "AABBCC";

        String result = ""; //"ABC"

        for (int i = 0; i < str.length(); i++ ) {
            String ch =""+ str.charAt(i); //"A", "A", "B", "B", "C", "C"
            if (result.contains(ch)) { //if the result already contains the character>contains method just you can use String
                continue; //skips
                //break; eger break kullanuyorsan exit demek
            }
                result += ch;

        }
        System.out.println(result);
    }
}
