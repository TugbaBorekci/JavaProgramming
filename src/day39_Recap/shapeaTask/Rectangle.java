package day39_Recap.shapeaTask;

public class Rectangle {

    private double length, width;

    //burdan sonra generate getter & setter yapmamiz lazim baska sayfalarda read and write yapabilmek icin


    public double getLength() {
        return length;
    }

    public void setLength(double length) {//condition yazmamiz lazim before set
        if (length <= 0) {
            System.err.println("Invalid Length: " + length);
            System.exit(1);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {//condition yazmamiz lazim before set
        if (width <= 0) {
            System.err.println("Invalid Width: " + width);
            System.exit(1);
            this.width = width;
        }
    }
}
/*
Rectangle extends Shape:
	variables:
		length
		width

	Encapsulate the fields

	Add a constructor to set the filed

	area(): length * width
	perimeter(): 2 * ( width + length)
	toString(): length, width, area, perimeter
 */