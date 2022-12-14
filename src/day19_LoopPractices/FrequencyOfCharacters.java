package day19_LoopPractices;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aabcccd";

        char ch = str.charAt(0);//0 yazarsak ilk character i 'a' how many times in oldugunu bulucak
        int count = 0;
        //find one character
        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);//each character of str
            if (ch == each) {
                count++;
            }
        }

        System.out.println(count);
    }
    }


      /*
        // butun characterlerin sayimi icin bu codu kullaniyoruz

        String str = "aabcccd";
        String result = "";
        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {

                char each = str.charAt(i);//each character of str
                if (ch == each) {
                    count++;
                }
            }
            if (result.contains("" + ch)) {//contains char olarak kullanilmadigi icin string seklinde yaziyoruz(""+ch)
                continue;//eger if blogunu yazarsak output print a2b1c3d1 seklinde yazicak
            }
            result += ch;
            result += count;
        }
        System.out.println(result); // if blogunu kullanmazsak output print a2a2b1c3c3c3d1
    }
}
*/

       /*
       1. Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1
        */