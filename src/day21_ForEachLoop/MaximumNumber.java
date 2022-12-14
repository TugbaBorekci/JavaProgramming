package day21_ForEachLoop;

public class MaximumNumber {
    public static void main(String[] args) {

        int[] numbers = {100, 500, 30, 600, 80, 90};
        int min = numbers[0];

        for (int number : numbers) {
            if (number > min);
            min = number;
        }
        System.out.println(min);




    }
}
