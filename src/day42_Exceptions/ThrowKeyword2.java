package day42_Exceptions;

import java.util.NoSuchElementException;

public class ThrowKeyword2 {

    public static void main(String[] args) {

        //this is create manually exception
        // throw new NoSuchElementException();//Process finished with exit code 1.it shows something is wrong.if you use NoSuchElementException() default constructor oldugu icin konsolda exception ta birsey yazdirmiyor
        throw new NoSuchElementException("There is no such element as break");//Process finished with exit code 1. it shows something is wrong.if you use String argument NoSuchElementException("There is no such element as break") konsolda yazdiriyor exception da "There is no such element as break"

       // throw new InterruptedException();//checked exception her zaman hata verir throw keyword sadece unchecked exception da kullanilir
        //after throw code you can not use any print statements it will not work
         //System.out.println("hello world");//hata veriyor throw keyword dan sonra kullandigimiz icin

           // throw new Rectangle(5,7);

    }
}
