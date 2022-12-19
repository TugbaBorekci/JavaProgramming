package day39_Recap.shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        //first create square object
        /*
         Square square = new Square(-10); //negatif number yada 0  girersek
         System.out.println(square);
         konsolda : Invalid Side? -10.0 yazdirir
         */
        Square square = new Square(10);//0 dan buyuk pozitif sayi girilmesi lazim.negatif number yada 0  girersek invalid yazdirir
        System.out.println(square);//Square{side=10.0, area='100.0', perimeter='40.0'}

        //yada bu sekilde de hesaplayabiliriz
        square.setSide(15);
        System.out.println(square);//Square{side=15.0, area='225.0', perimeter='60.0'}

        System.out.println("----------------------------------------------------");

        // create rectangle object
        Rectangle rectangle = new Rectangle(5,6);//0 dan buyuk pozitif sayi girilmesi lazim.negatif number yada 0  girersek invalid yazdirir
        System.out.println(rectangle);//Rectangle{length=5.0, width=6.0, area='30.0', perimeter='22.0'}

        System.out.println("----------------------------------------------------");

        // create circle object
        Circle circle = new Circle(7.5);//0 dan buyuk pozitif sayi girilmesi lazim.negatif number yada 0  girersek invalid yazdirir
        System.out.println(circle);//Circle{radius=7.5, pi='3.14', area='176.625', perimeter='47.1'}
        //yada bu sekilde yazabiliriz
        circle.setRadius(15.5);
        System.out.println(circle.getRadius());//15.5
        System.out.println(circle);//Circle{radius=15.5, pi='3.14', area='754.385', perimeter='97.34'}
        System.out.println(circle.getName());//Circle


    }
}
