package day15_ForLoop;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Split or No split (yes or No)?");
        String yesOrNo = scan.next().toLowerCase();

        System.out.println("Enter the number of people:");
        int numOfPeople = scan.nextInt();

        System.out.println("Enter the check amount:");
        double amount = scan.nextDouble();

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String service = scan.next().toLowerCase();

        double tipRate = (service.equals("excellent"))? 0.25 :(service.equals("gretat"))? 0.2
                        :(service.equals("good"))? 0.15 :(service.equals("fair"))? 0.1 : 0.05;

        double totalTip = amount * tipRate;

        System.out.println("Number of people entered: " + numOfPeople);
        System.out.println("Total to pay: " + amount);
        System.out.println("Total tip: " + totalTip);

        if (yesOrNo.equals("yes"));
        System.out.println("Total per person:"+ (amount/numOfPeople));
        System.out.println("Tip per person:"+(totalTip/numOfPeople));

        scan.close();

    }
}
