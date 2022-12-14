package OfficeWeek3;

import java.util.Scanner;

public class SingleIf {
    public static void main(String[] args) {

/*
      // 1. assign two variable with different numbers, using if statement, print the bigger one with proper message
        int a = 15;
        int b = 6;

        if (a > b) {
        System.out.println(a +" is bigger than " + b);
    }else{
            System.out.println(a + " is smaller than " +b);
        }
      */

        /*
     // 2. A shop will give discount of 10% if the total amount is more than 1000. using if statement, print if you can get discount
      int totalAmount = 1200;
      if (totalAmount >= 1000){
          System.out.println("you can get discount");


      }else{
          System.out.println("you can not get discount");
      }

*/
/*

       // 3. check kids age, decide which school they should go to
    /*
    0-2 at home
    3-6 kindergarten
    7-12 primary school

        int age = 6;
        if (age > 0 && age <=3){
            System.out.println("the kid should be at home");

        } else if (age >= 3 && age <= 6) {
            System.out.println("the kid should go to kindergarten");

        } else if (age >=7 && age <=12) {
            System.out.println("the kid should go to primary school");

        }else {
            System.out.println("please enter proper number");
        }
*/
      /*
        String brand = "";
        switch (brand){
            case "Apple":
                System.out.println("Buy an Iphone");
                break;
            case "Samsung":
                System.out.println("Buy a Samsung");
                break;
            case"Motorolla":
                System.out.println("Buy a Motorolla");
            default:
                System.out.println("please enter another of brand");
        }
*/
/*
        int orderNumber =120;

        switch (orderNumber){
            case 119:
                System.out.println("order 119 is ready");
                break;
            case 120:
                System.out.println("order 120 is ready");
                break;
            case 121:
                System.out.println("order 121 is ready");
                break;
            default:
                System.out.println("Please wait for your order");
        }


*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter browser name");
        String browserName = scan.nextLine();
        System.out.println("browserName = " + browserName);
        switch (browserName){
            case "firefox":
                System.out.println("firefox is being set up");
                break;
            case "chrome":
                System.out.println("chrome is being set up");
                break;
            case "edge":
                System.out.println("edge is being set up");
                break;
            default:
                System.out.println("please enter a valid browser name");

        }



    }


}
/*
        use switch, provide different phone brands
        according to them, print message that buy that brand
        example of string
         */