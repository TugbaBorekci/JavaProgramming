package day31_Constructors;

public class RectangleObject {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(5.5, 3.5);

        Rectangle rectangle2 = new Rectangle(10.5, 8.5);

        System.out.println(rectangle1);//Rectangle{length=5.5, width=3.5, area=19.25, perimeter=18.0}
        System.out.println(rectangle2);//Rectangle{length=10.5, width=8.5, area=89.25, perimeter=38.0}

    }

}
