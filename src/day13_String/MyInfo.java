package day13_String;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in); //EnterEnter
        System.out.println("Enter your age");
        int age = scan.nextInt();//19 Enter

        System.out.println("Enter your gender");
        String gender = scan.next();//Male or Female Enter

        scan.nextLine();//we add nextLine additional method because next one is nextLine and before nextInt

        System.out.println("Enter your full name");
        String fullName = scan.nextLine(); //if the previous scanner method that's  used is not nextLine (), then we need

        System.out.println("Enter your phone number");
        long phoneNumber = scan.nextLong();

        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your school name");
        String schoolName = scan.nextLine();

        System.out.println("Enter your city name");
        String city = scan.nextLine();

        System.out.println("Enter your state name");
        String state = scan.nextLine();

        System.out.println("Enter your building number");
        int buildingNum = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your Street name");
        String street = scan.nextLine();

        scan.close();

        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("Address: \n\t" +buildingNum+" "+street+"\n\t"+city+", "+state+" "+zipCode);
        System.out.println("schoolName = " + schoolName);











    }



}
/*
1. Create a class called MyInfo. Write a program that can ask the user to:
			1. Enter your age (int)(int--->nextInt())
			2. Enter your gender (String- One word ONLY)(String----->next())nextLine() additional
			3. Enter your full name (String- Multiple words)(string----->nextLine())burda full name iki kod oldugu icin nextLine kullaniyoruz
			4. Enter your phone number (long)(long---->nextLong())
			5. Enter your zip code (int)(int---->nextInt()) nextLine() additional
			6. Enter your School name (String- Can be Multiple words)(String----->nextLine()
			7. Enter your city name (String- Can be Multiple words)(String---->nextLine())
			8. Enter your state name (String- One word ONLY)(String---->next())
			9. Enter your building number (int)(int----->nextInt())nextLine additional
			10. Enter your Street name(int)(int----->nextLine())

		MAKE SURE USER CAN ENTER ALL THE INPUT

		Display all the inputs that user entered in following order in sperate lines:

			1. full name
			2. age
			3. gender
			4. phone number
			5. address:
						buildingNumber Street
						City, State ZipCode

			6. school name


String: presented in "java.lang" package

		Any class in "java.lang" package can be imported implicitly


Index Numbers: starts from zero

		"Cydeo"
		 01234

		"Java"

String Methods:

		charAt(index): returns the character at the given index, returns char

		length(): returns the total number of characters. returns int




Task:
	initial:
		firstName = "Wooden";
		lastName = "Spoon";

	output:
		W.S



 */