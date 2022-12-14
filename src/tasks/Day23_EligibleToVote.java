package tasks;

public class Day23_EligibleToVote {
    public static void main(String[] args) {
        ageOfPerson(2005);

    }

    //create a method that can check if a person is eligible to vote
    public static void ageOfPerson(int birthYear) {
        int age = 2022 - birthYear;

        if (age >= 19) {
            System.out.println("You are eligible to vote!");
        } else {
            System.out.println("You are not eligible to vote!");

        }
    }
}
