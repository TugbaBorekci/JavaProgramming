package day42_Exceptions;

public class MorningWorkOut {

    public static void main(String[] args) {

//1. Do 30 push-ups and try pausing 1.5 seconds in each
        System.out.println("------------Push up started---------------");

        for (int i = 1; i <= 30; i++) {

            System.out.print("\r Push up " + i);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\n------------Push up completed---------------");


        //2. Do 20 Pull-ups and try pausing 2.5 seconds in each

        System.out.println("------------Pull up started---------------");

        for (int i = 1; i <= 20; i++) {

            System.out.print("\r Pull up " + i);
            sleep(1.5);
        }

        System.out.println("\n------------Pull ups completed---------------");


    }
    //                  2.5
    public static void sleep(double seconds){

        try {
            Thread.sleep((long) (seconds * 1000) );
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }
}
/*
MorningWorkOut:
			1. Do 30 push-ups and try pausing 1.5 seconds in each


			2. Do 20 Pull-ups and try pausing 2.5 seconds in each


 */