package day18_NestedLoop;

public class NestedLoopPractice2 {
    public static void main(String[] args) {

        for (int j = 0; j < 10; j++) {//j:0, 1, 2, 3, 4, 5, 6, 7, 8, 9 toplamda 10 bu for loopu da yazmamiz gerekiyor

            for (int i = 0; i < 10; i++) {//i:0, 1, 2, 3, 4, 5, 6, 7, 8, 9 toplamda 10
                System.out.print("* ");//yanyana istedigimiz icin print yapiyoruz

            }
            //empty print statement koyuyoruz bos line olsun diye
            System.out.println();

        }
    }
}
/*
1. Print the following shape by using a nested Loop:
         * * * * * * * * * *
         * * * * * * * * * *
         * * * * * * * * * *
         * * * * * * * * * *
         * * * * * * * * * *
         * * * * * * * * * *
         * * * * * * * * * *
         * * * * * * * * * *
 */
