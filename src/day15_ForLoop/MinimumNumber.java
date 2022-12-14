package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int min = 2147483647;//any number that  user enter number will be enter less then 2147483647

        for(int i = 10; i < 15; i++) { //eger i=10 dan basla dersek uzerine 5 ekliyecegiz 5 defa yazilmasini istedigimiz icin i>15 olucak
                                        //i++ yazmamiz lazim increase number oluca.sadece i--azalan sayilar geriye giden oldugunda kullaniyoruz

            System.out.println("Enter a number:");
            int num = scan.nextInt();//printe 67, 23, 42, 5,-10 sayilarina girelim enter a name olarak

            if (num < min) {
                min = num;
            }
            System.out.println("min = " + min);
        }
    }

}
/*
Write a program that asks the user to enter a number for 5 times.
Then I want to return the maximum number
 */