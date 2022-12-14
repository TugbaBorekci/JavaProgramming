package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {

    public static void main(String[] args) {

        String  str = "aaabcccdeeef";//elementleri artirirsak yazdirdigimizda da artar. ggggggggghiiiiiiiijkkkkkkkkkl

        String[] arr = str.split("");//split method return String Array
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        System.out.println("list = " + list);//list = [a, a, a, b, c, c, c, d, e, e, e, f]

        String unique = "";

        for (String each : list){
            int frequency = Collections.frequency(list,each);
            if (frequency == 1){
                unique +=each;
            }
        }
        System.out.println("unique = " + unique);//unique = bdf



    }
}
