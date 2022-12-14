package day27_WrapperClasses;

public class WrapperClassesIntro {
    public static void main(String[] args) {
        int num1 = 200;

        //Long n2 =num1;

        Integer n1 = num1;//autoboxing(converting primitive to object(Wrapper) class)

        int num2 = n1;  //unboxing(converting object(Wrapper) class to primitive

        System.out.println("-------------------------------------------------");

        Integer integerValue = 100;
        long longValue = integerValue;

        System.out.println("-------------------------------------------------");

        int num3 = 200;
        //long l2 = num3;
        //Double d1 = num3;
        Integer num4 = num3; //autoboxing

        System.out.println("-------------------------------------------------");

        Byte b1 = 25;

        byte a1 = b1;
        short a2 = b1;
        int a3 = b1;
        long a4 = b1;

        System.out.println("-------------------------------------------------");

        Integer z = 900;
        Integer y = z;//wrapper method but not convert any

        System.out.println("-------------------------------------------------");

        int[] numbers1 = {1,2,3,4,5};
        Integer[] numbers2 = {1,2,3,4,5};//Array(data structure) convert to object(Wrapper)classes

        System.out.println("-------------------------------------------------");





    }
}
