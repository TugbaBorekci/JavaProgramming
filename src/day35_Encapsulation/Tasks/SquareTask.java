package day35_Encapsulation.Tasks;

import day35_Encapsulation.encapsulation.Task.Square;

public class SquareTask {

 private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side<=0){
            System.out.println("side should not be smaller then 0");
            return;
        }
        this.side = side;
    }
    public SquareTask(double side) {
        this.side = side;
    }

    public double calcArea(){
        return side*side;
    }

    public double calcPerimeter(){
        return side*4;
    }

    @Override
    public String toString() {
        return "SquareTask{" +
                "side=" + side +
                "area=" + calcArea() +
                "perimeter=" + calcPerimeter() +
                '}';

    }

    public static void main(String[] args) {

        Square square = new Square(4.5);
        System.out.println("Square Area " + square.calcArea() );
        System.out.println("Square Perimeter = " + square.calcPerimeter() );
        System.out.println(square);


    }
}

/*
1.1 Create a class named Square:
				Private variables:
					side

				Encapsulate all the fields

					Condition:
						side of the square should not be negative

				Add a constructor that allows user to set all the fields when the object is created.
								(If the arguments not valid it should not be set to the instances)

				Methods:
					calcArea(): returns the area of square
					calcPerimeter(): returns the perimeter of square
					toString(): can display the side, area, perimeter of square when object is passed in print statement
 */


