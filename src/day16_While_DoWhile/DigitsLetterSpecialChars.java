package day16_While_DoWhile;

public class DigitsLetterSpecialChars {
    public static void main(String[] args) {
        String str = "Cydeo12345School!@#%WoodenSpoon";

        String digits = ""; //12345
        String letters = ""; //CydeoWoodenSpoon
        String specialChars = ""; //!@#$%

        for (int i = 0 ; i < str.length(); i++) {

            char ch = str.charAt(i); //i: index number of str (0 ~ last index)
            System.out.println(ch); //ch: each character that we have in str

            if (ch >= '0' && ch <= '9'){// if the character between '0' to '9' then it is digit
                digits += ch;

            } else if (ch >= 'A' && ch <= 'Z') {//if the character between 'A' to 'Z' then it is digit
                letters += ch;

            } else if (ch >= 'a' && ch <= 'z') {//if the character between 'a' to 'z' then it is digit
                letters += ch;

            }else {//if the character is neither digit nor letter, then it is special character
                specialChars += ch;
            }
        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);
    }
}
