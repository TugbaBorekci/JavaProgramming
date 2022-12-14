package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {

        int a = 10,
            b = 20,
            c = 30;
        // if we have three different numbers, ONE MUST be MAXIMUM, ONE MUST be MINIMUM and one MUST be MEDIAN
      boolean aIsMedian = (a > b && a < c) || (a > c && a < b);
      //                   a=15, b=10, c=20    a=15, c=10, b=20
        /*
        in order for a to be the median number:
        1.if c is the maximum number & b is the minimum number, then a is median number
        2.if b is maximum number & c is the minimum number, then a is median number
         */
      boolean bIsMedian = (b > c && b < a) || (b > a && b < c);
      //                   b=15, a=20, c=10    b=15, a=10, c=20
        /*in order for b to be the median number:
        1.if c is the maximum number & a is the minimum number, then b is median number
        2.if a is maximum number & c is the minimum number, then b is median number
        */
      boolean cIsMedian = !aIsMedian && !bIsMedian;
    /*
    if a is not median number & c is not median number ,then c is median number
    */


      if (aIsMedian) { //if a is the median number
          System.out.println( a+ " is the median number");
      }

      if (bIsMedian) {//if b is the median number
          System.out.println( b+ " is the median number");
      }

      if (cIsMedian) {//if c is the median number
          System.out.println( c+ " is the median number");
      }










    }
}
/*
2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number


			Posibility #1: a could be median number
			Posibility #2: b could be median number
			Posibility #3: c could be median number

 */