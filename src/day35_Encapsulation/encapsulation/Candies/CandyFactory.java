package day35_Encapsulation.encapsulation.Candies;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {


        ArrayList<Candy> candies = new ArrayList<>();
        Candy candy1 = new Candy("Milka", 5, 2.500, false);
        Candy candy2 = new Candy("Ulker", 4, 3000, true);
        Candy candy3 = new Candy("Cadbury", 3, 1000, true);
        Candy candy4 = new Candy("Nutella", 6, 3200, false);
        Candy candy5 = new Candy("Kinder", 2, 1200, true);

        candies.addAll(Arrays.asList(candy1,candy2,candy3,candy4,candy5));
        System.out.println(candies);

        for (Candy each : candies) {
            System.out.println(each.getBrand()+ ":"+each.getPrice());

        }

    }
}
/*
  1.2 Create a class named CandyFactory
                Create an ArrayList of candies
                Add five objects of candies
                use for each loop to print the brand and price of each candy
 */