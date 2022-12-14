package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {

     // >, >=, <, <=

    boolean result1 = 20 > 40; //false
        System.out.println("result1 = " + result1);

    boolean result2 = 200 > 40; //true
        System.out.println("result2 = " + result2);

    boolean result3 = 300 >= 150; //true
        System.out.println("result3 = " + result3);

    boolean result4 = 100 >= 100; //true
        System.out.println("result4 = " + result4);

    boolean result5 = 300 >= 500;//false
        System.out.println("result5 = " + result5);

    boolean result6 = 100 < 120;//true
        System.out.println("result6 = " + result6);

    boolean result7 = 200 < 180; //false
        System.out.println("result7 = " + result7);

    int score = 59;
    boolean hasFailed = score <= 59; //true
        System.out.println("hasFailed = " + hasFailed);

    int score2 = 75;
    boolean hasFailed2 = score2 <= 59; //false
        System.out.println("hasFailed2 = " + hasFailed2);

    boolean result8  = 45 <= 60; //true
        System.out.println("result8 = " + result8);

        System.out.println("-------------------------------");

       int x = 100;
       int y = 200;
       boolean equal = x == y; //false
        //           100 == 200
        System.out.println("equal = " + equal);

        boolean result9 = "Muhtar" == "Good Guy"; //false
        System.out.println("result9 = " + result9);

        boolean result10 = 'A' == 'a'; //false
        System.out.println("result10 = " + result10);

        boolean result11 = '5' == '3'; //false
        System.out.println("result11 = " + result11);

        boolean result12 = "Java" == "Java";
        System.out.println("result12 = " + result12);

        boolean result13 = 100 != 200.5; //true
        System.out.println("result13 = " + result13);

        boolean result14 = "Java" != "Break"; //true
        System.out.println("result14 = " + result14);

        boolean result15 = 300 != 300; //false
        System.out.println("result15 = " + result15);














    }

}
