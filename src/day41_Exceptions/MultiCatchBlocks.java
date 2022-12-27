package day41_Exceptions;

import day39_Recap.cydeoTask.Employee;

public class MultiCatchBlocks {

    public static void main(String[] args) {

        Employee employee = null;


        //parent exception type child exception type dan once yazdirilirsa hata veriyor.once child exception type yazilmali
        try {

            System.out.println(employee.getSalary());//NullPointerException
        }catch (NullPointerException e){
            System.out.println("First catch block");
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
            System.out.println("Second catch block");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("Third catch block");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("Fourth catch block");
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("Fifth catch block");
            e.printStackTrace();
        }

        System.out.println("Tested Completed");//Process finished with exit code 1. Exception in thread "main" java.lang.NullPointerException
//eger exceptin type lardan doru olani yakalmadiysan finished with exit code 1 yazdirir konsolda. birseylerin yanlis gittiginin uyarisini verir hic birini yazdirmaz
//ama dogru exception type eklersen dogru olursa Process finished with exit code 0. dogru olani yazdirir  ve en sondaki println i de yazdirir
// Fourth catch block
//Tested Completed yazdirir.
        //birde NullPointerException uyarisi veriyor ilk catch i degistirelim yeni ekleyelim NullPointerException simdi de First catch block yazdirilcak ve en sondaki Tested Completed yazdirilicak


        System.out.println("------------------------------------------------------------");

        try {
            System.out.println("Java".charAt(-1));
        }catch (RuntimeException e) {
            e.printStackTrace();
        }


    }

}
