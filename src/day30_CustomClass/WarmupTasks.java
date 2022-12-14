package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

    public class WarmupTasks {

        public static void main(String[] args) {

         //Collaction.utility class
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));//Arrays value to the Collaction type yapmamiz gerekiyor.Bunu da Arrays utility.asList()metot ile

            Collections.swap(numbers, 0,  numbers.size()-1);//Collactions class.swap()metot ile neyi neyle takas yapicagimizi yaziyoruz swap metotun icine

            System.out.println(numbers);//[8, 2, 3, 4, 5, 6, 7, 1] 0 index number daki 1 ile son last index teki 8 in yeri degisti

            //int[] arr = {1,2,3,4,5,6,7,8};
            // System.out.println( Arrays.toString(arr )  );

            System.out.println("-----------------------------------------");

            ArrayList<Integer> list = new ArrayList<>();
            list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

            System.out.println(list);//[1, 0, 2, 0, 3, 0, 4, 0]

            int size = list.size();//size 8 (element sayisi)

            list.removeAll( Arrays.asList(0)  );//0 larin hepsini ArrayListten cikarmasini istiyoruz

            System.out.println(list);//[1, 2, 3, 4]

            int newSize = list.size();//size 4 oldu()4 tane 0 cikarildi

            int totalNumberOfZeros = size - newSize;//8 den 4 cikartiyoruz

            System.out.println("totalNumberOfZeros = " + totalNumberOfZeros);//4 tane 0 var
//for loop olusturuyoruz
            for (int i = 0; i < totalNumberOfZeros; i++) {
                list.add(0);
            }

            System.out.println(list);//[1, 2, 3, 4, 0, 0, 0, 0]

            System.out.println("-----------------------------------------------------------");
//second way
            ArrayList<Integer> list2 = new ArrayList<>();
            list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

            ArrayList<Integer> result = new ArrayList<>();

            for (Integer each : list2) {
                if(each != 0){
                    result.add(each);//[1, 2, 3, 4]yazdirir
                }
            }
//baska bir for each loop yapicagiz 0 lari eklemek icin
            for (Integer each : list2) {
                if(each == 0){
                    result.add(each);
                }
            }

            System.out.println(result);//[1, 2, 3, 4, 0, 0, 0, 0]


            System.out.println("-----------------------------------------------------------");

            String str = "ABCD123$%#@&456EFG!";

            ArrayList<Character> chars = new ArrayList<>();//first convert String to character(char)but we dont have a metot directly we should create for loop herbir karakteri ArrayListe ekliycek

            for (int i = 0; i < str.length(); i++) {
                chars.add( str.charAt(i) );//charAt() metot ile herbir karakter ArrayListe eklenmis oldu
            }


            ArrayList<Character> letters = new ArrayList<>( chars ); // add all the characters eger burdan sonra yazdirirsak
            System.out.println("letters = " + letters); //letters = [A, B, C, D, 1, 2, 3, $, %, #, @, &, 4, 5, 6, E, F, G, !]

            letters.removeIf( p -> !Character.isLetter(p)  ) ; //remove the characters that are not letters
            System.out.println("letters = " + letters);//letters = [A, B, C, D, E, F, G]


            ArrayList<Character> digits = new ArrayList<>( chars ); // add all the characters [A, B, C, D, 1, 2, 3, $, %, #, @, &, 4, 5, 6, E, F, G, !]
            digits.removeIf( p -> !Character.isDigit(p)); //removeIf()metod kullanarak digit olmayan karakterleri cikaricagiz

            System.out.println("digits = " + digits);//digits = [1, 2, 3, 4, 5, 6]

            ArrayList<Character> specialChar = new ArrayList<>( chars);//kalanlarin hepsinin special character oldugundan nasil emin olacagiz
//1.yol bu sekilde yapabilirsin
            //specialChar.removeAll( letters );//sadece letters lari remove yap
            //specialChar.removeAll( digits );//sadece digits leri remove yap
            //System.out.println("specialChar = " + specialChar);//specialChar = [$, %, #, @, &, !]

//2.yol removeIf()Metod lada yapabilirsin
            specialChar.removeIf( p ->  Character.isLetterOrDigit(p) );
            System.out.println("specialChar = " + specialChar);//specialChar = [$, %, #, @, &, !]



        }

    }
/*
1. write a program that can swap the first and last elements of an ArrayList
2. Write a program that can move all the zeros to the last indexes of ArrayList
					Ex:
						list: {1,0,2,0,3,0,4,0}
					output:
						[1, 2, 3, 4, 0, 0, 0, 0]
3. Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
				Ex:
					str = "ABCD123$%#@&456EFG!"
				output:
					list1: {1, 2, 3, 4, 5, 6}
					list2: {A, B, C, D, E, F, G}
					list3: {$, %, #, @, &, !}
 */

