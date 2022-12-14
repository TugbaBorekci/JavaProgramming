package Week05_10_08_2022;

import java.util.Scanner;

public class work {


    public static void main(String[] args) {

            Scanner scan=new Scanner(System.in);
            System.out.println("please enter your age ");
            int age= scan.nextInt();

            System.out.println("please enter your weight");
            int weight=scan.nextInt();

            if (age>=18){ // we checked age is greater tah or equal 18
                if (weight>50){
                    System.out.println("You are eligible to donate blood");
                }else {
                    System.out.println("You are not eligible to donate blood");
                }


            }else{ //  age is smaller than 18


                System.out.println("Age must be greater than 18");
            }



        }
    }

