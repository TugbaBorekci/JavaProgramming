package day12_Scanner;


import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

      //  System.out.println("Enter true or false");
      //  boolean result = input.nextBoolean();

        System.out.println("Enter you name: ");
        String name = input.next(); // Java Programming

        System.out.println("name = " +name); //Java

        input.close();

    }
}
