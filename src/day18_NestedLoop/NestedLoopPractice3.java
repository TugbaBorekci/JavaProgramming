package day18_NestedLoop;

public class NestedLoopPractice3 {
    public static void main(String[] args) {

            for (int j = 0; j < 10; j++) {//rows kactane olmasini istiyorsan ucgendeki yildiz sayisi yaz biz 10 istedik

            for (int i = 0; i <= j; i++) {//columns
                System.out.print( " *");
            }

                    //empty print statement koyuyoruz bos line olsun diye
                System.out.println();
            }
    }

}





/*
lunch:
Use a nested loop to print the following shape
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *
 */