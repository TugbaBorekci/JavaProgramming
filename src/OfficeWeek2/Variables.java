package OfficeWeek2;

import java.util.Locale;

public class Variables {
    public static void main(String[] args) {



    //byte : -128 to 127 arasi sayilari iceriyor byte data type
    byte number = 12;
    byte number1 = -32;


    //short : -32,768 to 32,767 arasi sayilar  short data type
    short number2 = 32000;
    short number3 = 5;

    //int : -2,147,483,648 to -2,147,483,647 arasi sayilar  int data type
    int number4 = 15201458;
    int number5 = 3876541;

    //long :
    long number6 = 152000000000000L;
    long number7 = 100;//it is include integer range not nececsy L
    long number8 = 2147483648L;

    //float
    float number9 = 3.1F;

    //double
    double letter1 = 3.2568;

    //char
    char letter2 = 'q';
    char letter3 = 'A';

    char letter4 = 93;//ASCII table a bak cunku char yani karakter olarak istiyor
    int number10 = 93;

        System.out.println(letter4);//]
        System.out.println(number10);//93

        char letter5 = 0;

        //boolean true or false
        boolean man = true;
        boolean married = false;

        System.out.println("-------------------------------------------------");

      double tax = 0.15;
      double johnSalary = 10000 - (10000  *tax);
      double watsonSalary = 7000 - (7000 * tax);
      double mikeSalary = 12000 - (12000 * tax);

        System.out.println("johnSalary = " + johnSalary);
        System.out.println("watsonSalary = " + watsonSalary);
        System.out.println("mikeSalary = " + mikeSalary);

        System.out.println("-------------------------------------------------");

        double tax2 = 0.12;
        double johnSalary1 = 10000 - (10000  * tax2);
        double watsonSalary1 = 7000 - (7000 * tax2);
        double mikeSalary1= 12000 - (12000 * tax2);

        System.out.println("johnSalary1 = " + johnSalary);
        System.out.println("watsonSalary1 = " + watsonSalary);
        System.out.println("mikeSalary1 = " + mikeSalary);

        System.out.println("-------------------------------------------------");

        int NumberOfEmployee = 10;//we can use variable name with Uppercase but not prefer its. starting lower case is better numberOfEmployee

        //This is Java rule that we have to OBEY = variable name yap bu cumleyi
        int thisIsJavaRuleThatWeHaveToOBEY = 0;


    }

}
