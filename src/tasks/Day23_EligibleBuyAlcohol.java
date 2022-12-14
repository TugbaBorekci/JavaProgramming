package tasks;

public class Day23_EligibleBuyAlcohol {
    public static void main(String[] args) {

        ageOfPerson(2004);

    }

    //create a method that can check if a person is eligible to buy alcohol
    public static void ageOfPerson(int birthYear) {
        int age = 2022 - birthYear;

        if (age >= 18) {
             System.out.println("You are eligible to buy alcohol");
        } else {
            System.out.println("You are not eligible to buy alcohol");
        }

    }
}


