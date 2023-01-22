package day45_Abstraction.shape;

public  class Square extends Shape {

    private double side;

   //constructor yapmazsak class name kismi hata veriyor
    public Square( double side) {
        super("Square");
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side){

        if ((side < 0)){

        }
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
               super.toString()+//bu sekilde parent(super) classin to string methodunu generate yapabiliyoruz
                "side=" + side +
                '}';
    }
}
