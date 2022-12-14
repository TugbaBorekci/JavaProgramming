package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {

        String[] students = {"Elif", "Sinem","Gunay", "Cihad", "David", "James", "Aaron", "Daniel"};
        String[] earlybirds = Arrays.copyOf(students,5);//burdaki sayi element sayisindan fazla olamaz eger yazarsan element sayisi kadarini yazar kalanini null yazar

        System.out.println(Arrays.toString(earlybirds));//Elif, Sinem, Gunay, Cihad, David 5 tane ismi yazart yukarida 5 tane istedigimiz icin

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        numbers = Arrays.copyOf(numbers,5);//hangi numarayi verirsek ona gore yazicak{1,2,3,4,5}
        System.out.println(Arrays.toString(numbers));//[1, 2, 3, 4, 5]

        System.out.println("-------------------------------------------------------");

        char[] ch1 = {'A','B','C','D','E','F','G','H','I'};
        char[] ch2 = Arrays.copyOfRange(ch1,2,6+1);

        System.out.println(Arrays.toString(ch2));//[C, D, E, F, G]

        System.out.println("-------------------------------------------------------");

        int[] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] result = Arrays.copyOfRange(scores,3,7);
        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(scores,3,scores.length);
        System.out.println(Arrays.toString(result2));//[40, 50, 60, 70, 80, 90, 100]
    }
}
