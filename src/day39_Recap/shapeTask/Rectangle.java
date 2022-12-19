package day39_Recap.shapeTask;

public class Rectangle extends Shape {


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
        }
        this.width = width;//if body disina yani buraya yazman gerekiyor yoksa islem yapmaz
    }

    //generator constructor yapmamiz lazim
     public Rectangle(double length, double width) {
        super("Rectangle");
        setLength(length);//this.keyword u silip manual olarak bunu yazdik
        setWidth(width);//this.keyword u silip manual olarak bunu yazdik
    }

    //generate override methods yapicagiz
    @Override
    public double area() {
       // return super.area();burasi silinip rectangle formula yazilicak
        return length * width;
    }

    @Override
    public double perimeter() {
       // return super.perimeter();burasi silinip rectangle formula yazilicak
        return 2 * ( length + width );
    }

    //generate toString method hazirliyacagiz
    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area='" + area() + '\'' +//manual olarak ekledik bu kismi
                ", perimeter='" + perimeter() + '\'' +//manual olarak ekledik bu kismi
                '}';
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