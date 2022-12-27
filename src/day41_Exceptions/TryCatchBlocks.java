package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Test Started");

      /*
      handle yapmamiz lazim excaption oldugu icin try & catch blok kullanmamiz lazim
        System.out.println(9/0);//Exception in thread "main" java.lang.ArithmeticException: / by zero
     */

        try {
            System.out.println(9 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Catch Block");
            System.out.println("Arithmetic Exception was occurred");

        }

        System.out.println("Test Completed");

        System.out.println("------------------------------------------------------------------");

        System.out.println("Test2 Started");
        int[] numbers = {1, 2, 3, 4, 5};

        //-----------------------------------*--------------------------------------------------
        /*
        handle yapmamiz lazim excaption oldugu icin try & catch blok kullanmamiz lazim
        //System.out.println(numbers[200]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 200 out of bounds for length 5at day41_Exceptions.TryCatchBlocks.main(TryCatchBlocks.java:29)
        */

        //-----------------------------------*--------------------------------------------------

        /*
        try {
            System.out.println(numbers[200]);
        }catch(NullPointerException e){
            System.out.println("Catch Block");
            System.out.println("Null Pointer exception was occurred");
        //ArrayIndexOutOfBoundsException sonucunu veriyor
        }
       */

        //-----------------------------------*--------------------------------------------------
        //(RuntimeException) kullanmamiz gerekiyor yazdirmasi icin
        try {
            System.out.println(numbers[200]);
        } catch (RuntimeException e) {
            System.out.println("Catch Block");
            System.out.println("Run time exception was occurred");
        }
        System.out.println("------------------------------------------------------------------");
/*
        try {
            System.out.println(numbers[200]);
        } catch (RuntimeException e) {
          e.printStackTrace();//java.lang.ArrayIndexOutOfBoundsException: Index 200 out of bounds for length 5 at day41_Exceptions.
        }

 */
        try {
            System.out.println(numbers[200]);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());//Index 200 out of bounds for length 5
        }

        System.out.println("Test2 Completed");

        System.out.println("------------------------------------------------------------------");

        System.out.println("Test3 Started");
/*
        try {
            System.out.println("Cydeo".substring(2,0));
        }catch (RuntimeException e){
            e.printStackTrace();//.StringIndexOutOfBoundsException: begin 2, end 0, length 5
         }
 */
        try {
            System.out.println("Cydeo".substring(2, 0));
        } catch (StringIndexOutOfBoundsException e) {
           e.getMessage();

        }
        System.out.println("Test3 Completed");

        System.out.println("------------------------------------------------------------------");

        System.out.println("Hello");

        try {
            Thread.sleep(3000);//ilk basta hatta veriyor sleep uzerine mouse la gelince hata aciklamasinda catch icine dogru type of exception yazinca hata cozuluyor
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Cydeo");

        //konsolda once Hello yazicak 3 sn sonra Cydeo da yazicak

        System.out.println("------------------------------------------------------------------");

        // FileInputStream file = new FileInputStream("File path");eger try catch yapmazsan hata veriyor

        try {
            FileInputStream file = new FileInputStream("File path");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
