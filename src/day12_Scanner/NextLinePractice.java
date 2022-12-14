package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);//enter


        System.out.println("Enter your age:");
        int age = input.nextInt();//19

        input.nextLine();// press Enter

        System.out.println("Enter your full name:");
        String fullName = input.nextLine(); // press Enter

        System.out.println("Enter your GPA:");
        double gpa = input.nextDouble();//3.5 press Enter

        System.out.println("Enter your school name:");
        String schoolName = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
        System.out.println("gpa = " + gpa);
        System.out.println("schoolName = " + schoolName);

        input.close();




        //devamini izle 12.video 2 saatten sonra





    }
}
