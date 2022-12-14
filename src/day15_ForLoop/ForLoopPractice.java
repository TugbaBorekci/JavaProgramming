package day15_ForLoop;

public class ForLoopPractice {
    public static void main(String[] args) {
        //15 16 17 18 ....45
    /*
        System.out.println(15);
        System.out.println(16);
        ...
        System.out.println(45);
    */

        for (int i = 15; i <= 45; i++) { //i:15 16 17 18 ....45
            System.out.print(i + " ");
        }
            System.out.println();
            System.out.println("----------------------------------");

            //100 99 98 97 ...50
            for(int i = 100; i >= 50; i--) {
                System.out.print(i + " ");//i:100, 99, 98, 97, ...50
            }

            System.out.println();
            System.out.println("----------------------------------");

            //print all the even numbers between 1~55

                for(int i = 1; i <= 55; i++ ) {
                    if (i % 2 == 0) {
                        System.out.print(i + " ");
                    }
                }
                    System.out.println();
                    System.out.println("----------------------------------");
             //print all the even numbers between 1~55 second solution

                    for(int i = 2; i <= 54; i+=2 ){//even number 2 den basladigi icin 2 yi yazip i+=2 yani ikiser atla diyerek te kodlayabiliriz
                        if (i % 2 == 0){
                            System.out.print(i + " ");
                        }
                    }



    }
}
