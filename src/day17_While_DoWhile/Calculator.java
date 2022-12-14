package day17_While_DoWhile;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first number:");
        int num1 = scan.nextInt();

        System.out.println("Enter your second number:");
        int num2 = scan.nextInt();

        System.out.println("Enter a math operator:");
        char ch = scan.next().charAt(0);

        while ( !(ch == '+' || ch == '_')){//if the operater invalid
            System.out.println("Invalid Operator, please re_enter");
            ch = scan.next().charAt(0);
        }


      /*
      For Loop Methodu kullanilir ama best way degil
      for (int i = 0 ; !(ch == '+' || ch == '-');) {
           System.err.println("Invalid Operator, Please re-enter");
           ch = scan.next().charAt(0);

       }

*/

        System.out.println((ch =='+')? num1+num2 :num1-num2);


    }
}
