package Week04_10_2022;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter one integer number");
        int intValue = scanner.nextInt();
        System.out.println("intValue = " + intValue);

        System.out.println("please give me double number");
        double doubleValue = scanner.nextDouble();
        System.out.println("doubleValue = " + doubleValue);

        scanner.nextLine();//in order to get Enter button from the user***(important nextLine kullandigimiz zaman oncesinde farkli data lar kullanildiysa oncesinde bunu yazmamiz gerekiyor)
        System.out.println("give me the sentence");
        String sentence = scanner.nextLine();
        System.out.println("sentence = " + sentence);

        String sentence2 = scanner.nextLine();// burada tekrar oncesinde scanner.nextLine()kullanmaya gerek yok cunku oncesinde nextLine kullanildi
        System.out.println("sentence2 = " + sentence2);


    }
}
