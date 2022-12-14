package day19_LoopPractices;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = "";//bdf
        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);//'A'
            int count = 0; //represents the frequency of the ch
            for (int i = 0; i < str.length(); i++) { //compares the character that outer loop picked, with each character
                char each = str.charAt(i); //each character of string
                if (ch == each) { //each character compare if it is matching increase the count by one
                    count++;
                }
            }
            if (count == 1) {// if the frequency of the character is 1, then the character is unique
                result += ch;

            /*
           if (count != 1){//baska bir if kosulu da yazabiliriz bir tane yani unique degilse atla gec demek
           continue;
            }
            result += ch;
             */


            /* eger duplicated karakterleri bulmasini isteseydik baska sayfada deneyebilirsin
           if (count > 1){
           continue;
            }
            result += ch;
             */


            }
            System.out.println(result);
        }
    }

    }

/*
                char ch = 'a'; //her karakterin kactane oldugunu bulmak icin for loop metodu kullanarak bir karakterin ne kadar kullanildigina bakiyoruz
                int count = 0; //represents the frequency of the ch
                for (int i = 0; i < str.length(); i++) { //length()kullaniyoruz stringin icindekinin hepsini gormek icin
                 char each = str.charAt(i); //each character of string
                if (ch == each){ //each character compare if it is matching increase the count by one
                count++;
                  }
            }
            System.out.println(count);
 */



/*
2. Write a program that can find the unique characters from a string without using indexOf() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf
 */