package day39_Recap.shapeaTask;

public class ShapeObjects {

    public static void main(String[] args) {

        //first create square object
        /*
         Square square = new Square(-10); //negatif number yada 0  girersek
         System.out.println(square);
         konsolda : Invalid Side? -10.0 yazdirir
         */
        Square square = new Square(10);
        System.out.println(square);//Square{side=10.0, area='100.0', perimeter='40.0'}

        //yada bu sekilde de hesaplayabiliriz
        square.setSide(15);
        System.out.println(square);//Square{side=15.0, area='225.0', perimeter='60.0'}

        //first create rectangle object
        Rectangle rectangle = new Rectangle(5,6);
        System.out.println(rectangle);



    }
}
