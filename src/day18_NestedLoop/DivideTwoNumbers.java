package day18_NestedLoop;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        int a = 30;
        int b = 7;
        int count = 0; //count=1+1=2+1+3+1=4

  /*    a -= b;  // a = 23
        a -= b;  // a = 16
        a -= b;  // a = 9
        a -= b;  // a = 2
 */
        while(a >= b){ //while loops body executed to bottom
            a -= b;
            count++;
        }
        System.out.println(count+" with a remainder of "+a);








    }

}
/*
 1.  Write a program that can divide two positive numbers without using / (division) and * (multiplication) and % operators

                        20 / 6 ==> 3 with the reminder of 2


                        a = 20
                        b = 6;


                        a -= b;  // a = 14
                        a -= b;  // a = 8
                        a -= b;  // a = 2


                        x = 100;
                        y = 8;

                        while(a >= b){
                                a -= b;
                                count++;
                        }

 */