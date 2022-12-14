package day19_LoopPractices;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num1 = scan.nextInt();

        System.out.println("Enter a math operator:");
        char operator = scan.next().charAt(0);// "-" veya "+" taking as a string then assign char olarak atamak istedigimizde charArt(0) yazip 0 indexini almasini istersek olur

        if(!(operator == '+' || operator == '-')){//if the operator is not valid
            System.err.println("Invalid Math Operator: "+operator);
            System.exit(0);//terminates the whole program.blogunu koyarsak islemi yaptiktan sonra bitirir devam etmez,ikinci enter a number kismi calismaz
        }

        System.out.println("Enter a number:");
        int num2 = scan.nextInt();

        if(operator == '-'){
            System.out.println(num1 - num2);
        }else{
            System.out.println(num1 + num2);
        }




    }
}
