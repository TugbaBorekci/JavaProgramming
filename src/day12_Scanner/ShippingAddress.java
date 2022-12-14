package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);//Enter Enter

        System.out.println("Enter your full name:");
        String fullName = scan.nextLine();//Java Programming Enter

        System.out.println("Enter your building number:");
        String building = scan.next(); //7925A

        scan.nextLine();//Enter

        System.out.println("Enter your Street name:");
        String  street = scan.nextLine();//Jones Branch DriveEnter

        System.out.println("Enter your city name:");
        String city = scan.nextLine(); //McLeanEnter

        System.out.println("Enter your state:");
        String state = scan.next();//VAEnter

        System.out.println("Enter your zip code:");
        String zip =  scan.next();//22012Enter


        System.out.println("fullName = " + fullName);
        System.out.println("building = " + building);
        System.out.println("street = " + street);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("zip = " + zip);


        scan.close();//sayfayi kapatmamiz gerekiyor


    }
}
/*
  istedigimiz veriler        kullanabilicegimiz method
1.Enter your full name ---------------nextLine() more then one word
2.Enter your building number----------next() any characters letters A or B or C or Numbers
3.Enter your Street name--------------nextLine() more then one word
4.Enter your city name----------------nextLine() more then one word
5.Enter your state--------------------next() any characters letters A or B or C or Numbers
6.Enter your zip code-----------------next() any characters letters A or B or C or Numbers

Display the shipping address


 */