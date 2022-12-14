package day20_Arrays;

public class AverageNumbersArrays {
    public static void main(String[] args) {

        int[] numbers = {10, 20,30,40,50,60};

        int sum = 0;//10+20+30+40...

        //best way for loop
        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
        }
        double averageNumber = sum/ numbers.length;
        System.out.println("averageNumber = " + averageNumber);
    }

}
