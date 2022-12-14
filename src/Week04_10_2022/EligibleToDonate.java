package Week04_10_2022;

import java.util.Scanner;

public class EligibleToDonate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your age");
        int age = input.nextInt();
        //System.out.println("please enter your weight)bunu buraya koyarsak yasi ne olursa olsun kilosunu sorucak ama logik olarak kiloyu if (weight>=0)kismindan sonra koyarsak daha mantikli
         //double weight = input.nextDouble();
        if (age>=18){
            System.out.println("please enter your weight");
            double weight = input.nextDouble();
            System.out.println("please enter your weight");
            //System.out.println(" you are eligible to donate blood"); //if den sonra bunu buraya koyarsak yasi 18 den kucukse direkt sonuca yonlendiricek

            if (weight>=50){

       }else {
           System.out.println(" you are not eligible to donate blood");
       }

        }else {//if my age smaller than 18

            System.out.println("Age must be greater than18");


        }

    }
}
//istenen verilere gore denklemi kur