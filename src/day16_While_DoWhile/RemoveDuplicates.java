package day16_While_DoWhile;

public class RemoveDuplicates {
    public static void main(String[] args) {


        String str = "aabbcc";

        String result = "";//abc(double olan harfleri remove yapticak)
                         //i <= 7 ===>i<8
        for (int i = 0; i <= str.length()-1 ; i++) { //i: represent the all the index numbers of str(start from 0)
            String ch =""+str.charAt(i);// represent each Character of str

            if (!result.contains(ch) ) {// if the character is not contained in the result
                result += ch;//the character will be added to the result

            }
        }
        System.out.println(result);//iki tane curlybrace den sonra yazmak gerekiyor print kismini yoksa farkli sonuc veriyor
    }
}


/*
2. Write a program that can remove the duplicated characters from a String
			Ex:
				input:
					AABBCCBC

				Output:
					ABC

			Hint: You can add each character of the string into another String
				  Condition: the character is not contained in the other String yet before you are adding
 */