package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println("12" + 1);//121, concatenation
        System.out.println(100 - 50);//50, subtraction
        System.out.println(10 * 6);//60, multiplication
        System.out.println(100 / 3);//33
        System.out.println(10.0 / 4);//2.5
        System.out.println(10 / 4.0);//2.5
        System.out.println(10d / 4); //2.5

        int a = 100;
        double b = a/6;//16.0   why we write 16,0 because int/double(decimal) result take decimal(double)
        System.out.println(b);

        double c = a/6.0;       //16.66666 or you can write double c = a/6d;
        System.out.println(c); //result is double(decimal)

        System.out.println(100D); //if we see(100D)D meaning decimal.if we won't write D we can write 100.0






    }


}
/*
+ : Addition
- : Subtract
* :Multiplication
/ :Division

 integer / integer ======> integer
 decimal / integer ======> decimal
 integer / decimal ======> decimal
 decimal / decimal ======> decimal

 in math:
 10/4 = 2.5
 100/3 = 33.333

 in java:
 10/4 = 2
 10.0/4 = 2.5






 */