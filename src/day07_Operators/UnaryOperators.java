package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {

        int num1 = +25;
        int num2 = -25;

        System.out.println(num1 < 0); //false
        System.out.println(num2 < 0); //true

        System.out.println("--------------------");

        int a = 5;
        ++a; //pre increment :increases the value by 1 right away
        System.out.println(a); //6

        --a; //pre decrement :decrease the value by 1 right away
        System.out.println(a); //5

        System.out.println("---------------------");

        int b = 100;
        System.out.println(++b);

        int c = 100;
        System.out.println(c++); //post increment:first passes the current value, then increases the value by 1
        System.out.println(c);  //increases the value by 1 right away=101

        System.out.println("--------------------------------------");

        int x = 200;
        System.out.println(--x); // pre decrement: decrease the value by 1 right away=199

        int y = 200;
        System.out.println(y--); // post increment:first passes the current value, then decreases the value by 1
        System.out.println(y);

        System.out.println("----------------------------------------");

        int z = 45;
        System.out.println( ++z); //pre increment :increases the value by 1 right away:46
        System.out.println( z++); //post increment:first current value:45;then increases the value by 1:46
        System.out.println(z); //47

        System.out.println("----------------------------------------");

        int q = 30;
        System.out.println(--q); //pre decrement :decreases the value by 1 right away:29
        System.out.println(q--); //post decrement:first current value:30;then decreases the value by 1:29
        System.out.println(q); //decreases the value by 1 right away:28

    }
}
