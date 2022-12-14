package day17_While_DoWhile;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String str = "AAABBBC";
        char ch = 'A';

        int frequency = 0;//+1 increase+1increase+1increase===>3
        for ( int i = 0 ; i < str.length() ; i++) { //i: index of str
            char eachChar = str.charAt(i);//eachChar: each character of str

            //'A' == 'A'
            if(ch == eachChar){ // if given ch is matching with the eachChar, then ch is appeared in the string
                frequency++;//or you can use frequency +=1
            }
        }
            System.out.println(frequency);

    }
}
