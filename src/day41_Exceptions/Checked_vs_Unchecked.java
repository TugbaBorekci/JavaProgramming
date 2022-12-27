package day41_Exceptions;

import day33_Statics.Student;

import java.io.FileInputStream;

public class Checked_vs_Unchecked {

    public static void main(String[] args) {

        //Unchanged Exception:
        int a = 10;
        int b = 0;

        // System.out.println(a/b);// Process finished exit code 1. Exception in thread "main" java.lang.ArithmeticException: / by zero
        // System.out.println("Wooden Spoon");

 //------------------------*--------------------------*------------------------

        char[] characters ={'A','B','C'};
        //                   0   1   2
        //System.out.println(characters[99]);//Process finished exit code 1. Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 99 out of bounds for length 3

//------------------------*--------------------------*------------------------

        Student student = null;
        System.out.println(student.getName());//Process finished exit code 1. Exception in thread "main" java.lang.NullPointerException
        //student.study();

//------------------------*--------------------------*------------------------

        String str = "Wooden Spoon";
        str = null;
        System.out.println(str.toUpperCase());//Process finished exit code 1. Exception in thread "main" java.lang.NullPointerException

//------------------------*--------------------------*------------------------

        //Checked Exception:

        System.out.println("Hello");

        //Thread.sleep(3000);//java: unreported exception java.lang.InterruptedException; must be caught or declared to be thrown
                            //eger handled yapmazsan calismiyor.hatanin uzerine gelip problemi okuyup duzeltebilirsin
        System.out.println("Cydeo");


//------------------------*--------------------------*------------------------

        //FileInputStream file = new FileInputStream("path of the file");//java: unreported exception java.io.FileNotFoundException; must be caught or declared to be thrown

//------------------------*--------------------------*------------------------




    }

}
