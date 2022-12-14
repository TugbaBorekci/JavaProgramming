package day20_Arrays;

import java.util.Arrays;

public class ArraysDays {

    public static void main(String[] args) {



        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
                 //index   0           1            2          3           4          5          6
        System.out.println(Arrays.toString(days));//[Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]

        System.out.println("--------------------------------------------------------");

        int number = 5;
        if (number < 1 || number > 7){
            System.err.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(days[number]);//Saturday
        System.out.println(days[number-1]);//Friday
        System.out.println(days[number+1]);//Sunday






    }
}
