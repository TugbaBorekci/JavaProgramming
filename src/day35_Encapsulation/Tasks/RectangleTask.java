package day35_Encapsulation.Tasks;

public class RectangleTask {
    //1 Create a class named Rectangle: Private variables: width, length
    private double width;
    private double length;

    //3-constructor i buraya olusturabiliriz
    public RectangleTask(double width, double length) {
        this.width = width;
        this.length = length;
    }

    //2-Encapsulate all the fields:generate getter & setter---setter icine condition yaz
    //                                      Conditions:width of the rectangle should not be negative
    //						             	length of the rectangle should not be negative
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            System.out.println("width of the rectangle should not be negative");
            this.width = width;
        }
    }

    public double getLength() {
        return length;
    }


    public double setLength(double length) {
        if (length <= 0) {
            System.out.println("length of the rectangle should not be negative");
            this.length = length;
        }
        return length;
        //4-calcArea(): returns the area of rectangle
    }
    public double calcArea(){
        return width*length;
    }
        //5-calcPerimeter(): returns the perimeter of rectangle
    public double calcPerimeter(){
        return 2*(width+length);
    }

    //6-toString(): can display the width, length, area, and perimeter of rectangle when object is passed in print statement
    @Override
    public String toString() {
        return "RectangleTask{" +
                "width= " + width +
                ", length= " + length +
                ", area= " + calcArea() +
                ", perimeter =" + calcPerimeter() +
                '}';
    }

    //main method hazirlayip print statementlari yazip run yaptiralim
    public static void main(String[] args) {

        RectangleTask rectangle = new RectangleTask(2,2);
        System.out.println("Rectangle Area " +rectangle.calcArea());
        System.out.println("Rectangle Perimeter " + rectangle.calcPerimeter());
        System.out.println(rectangle);
    }
}
/*
2. Rectangle Task:
		2.1 Create a class named Rectangle:
				Private variables:
					width, length

				Encapsulate all the fields
						Conditions:
							width of the rectangle should not be negative
							length of the rectangle should not be negative

				Add a constructor that allows user to set all the fields when the object is created.
						(If the arguments not valid it should not be set to the instances)

				Methods:
					calcArea(): returns the area of rectangle
					calcPerimeter(): returns the perimeter of rectangle
					toString(): can display the width, length, area, and perimeter of rectangle when object is passed in print statement

 */