package day18_NestedLoop;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        while (true) {


            System.out.println("Enter your first number");
            int num1 = scan.nextInt();

            System.out.println("Enter your second number");
            int num2 = scan.nextInt();

            System.out.println("Addition:" + (num1 + num2));
            System.out.println("Would you like to continue?");//no yazarsak devam etmiyor yes yada baska bir veri versek maybe gibi yazarsak devam ediyor istedigimiz kadar
                                                                //ama while loop kullanirsak sadece yes ve no cevabina gore deva ettirebiliriz baska cevap olursa invalid entry yazabiliriz
            String a = scan.next().toLowerCase();

            while ( !(a.equals("yes") || a.equals("no")) ){//if the answer invalid while loop calisicak
                System.err.println("Invalid Entry, Please re enter");//burdan sonra tekra other loop calismaya devam edicek no cavabini verene kadar
                 a = scan.next().toLowerCase();//bunu yazmazsak konsolda print kismi surekli yazmaya devam ediyor durmuyor
            }

            if (a.equals("no")){
                break;//exits the outer loop
            }



        }
    }
}