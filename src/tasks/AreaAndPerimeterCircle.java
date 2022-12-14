package tasks;

import java.util.Scanner;

public class AreaAndPerimeterCircle {
    public static void main(String[] args) {

        double r;
        double diameter;
        double area;
        double perimeter;
        double pi = 3.14;
        //bunlar double r,diameter,area,perimeter,pi=3.14 seklindede yazabiliriz hepsi double veri oldugu icin farkli olursa ayri ayri yazmak gerekiyor

        Scanner scan = new Scanner(System.in);
        while (true) {
        System.out.println("Enter the radius of the circle:");
        r = scan.nextDouble();
        if (r <= 0) {
            System.out.println("Invalid Entry for the radius of the circle");

        } else if (r >= 0) {
            diameter = 2 * r;
            perimeter = 2 * pi * r;
            area = pi * (r * r);
            System.out.println("Diameter of circle: " + diameter);
            System.out.println("Perimeter of circle: " + perimeter);
            System.out.println("Area of circle: " + area);
        }
        System.out.println("Would you like to calculate another circle? (yes/no)");
        String a = scan.next();

        if ((a.equalsIgnoreCase("yes"))) {
            continue;
        }else if  (r <= 0) {
            System.out.println("Invalid Entry for the radius of the circle");
        }
            if (a.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
                System.exit(0);


            }
            }
    }
}
/*
1. Write a program that can calculate the area and perimeter of a circle:
			1. Ask the user "Enter the radius of the circle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the radius of the circle"

			2. Display:
					1. Diameter of circle
					2. Area of circle
					3. Perimeter of circle

			3. Ask the user "Would you like to calculate another circle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

 */