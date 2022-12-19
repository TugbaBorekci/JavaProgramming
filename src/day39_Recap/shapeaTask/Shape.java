package day39_Recap.shapeaTask;

public class Shape {

    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        if (name==null){
            System.out.println("Name can not be null");
            System.exit(1);//1: something went wrong
        }

        if (name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public Shape(String name) {
        setName(name);
    }

    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +//manual olarak ekledik bu kismi
                ", perimeter='" + perimeter() + '\'' +//manual olarak ekledik bu kismi
                '}';
    }
}
/*
Shape:
	variables:
			name

	Encapsulate the field

	Add a constructor to set the filed

	Methods:
		area(){}
		perimeter(){}
 */