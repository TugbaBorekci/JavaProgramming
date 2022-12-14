package Week06_15_10_2022;

public class T6_HiddenSentence {
    public static void main(String[] args) {

        /*
        Task 6: Given a sentence which is ended with "." included lettters, numbers, special charecters and then find hidden sentence.
input:
        String sentence = "Y*78*8*o770987987u a869869=r????23425235e t54898)!'^h^^&%e b+%^^e%&+s%&t g+%&%+u/%y&/s.&6756/D4o n556576ot5675 c657467a7657r7657e a6575b6575o5675u567t i5467t&";
output:
You are the best guys
         */

        String sentence = "Y*78*8*o770987987u a869869=r????23425235e t54898)!'^h^^&%e b+%^^e%&+s%&t g+%&%+u/%y&/s.&6756/D4o n556576ot5675 c657467a7657r7657e a6575b6575o5675u567t i5467t&";

        String resultSentence = "";
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch == '.')//eger bunu calistirmazsan
              break;//ve bunu calistirmazsan output: you are the best guysDo not care about it yazicak
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || ch == ' ')
                resultSentence += ch;


        }
        System.out.println(resultSentence);
    }
}
