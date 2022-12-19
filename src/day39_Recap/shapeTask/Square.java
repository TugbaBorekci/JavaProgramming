package day39_Recap.shapeTask;

public class Square extends Shape {

    private double side;//side is instance veriable.eger bunu public yaparsak daha sonra objects clasda yaicagimiz islemlerde condition i kontrol etmeden direkt girilen sayinin 0 yada negatif(invalid) olmasina bakmadan islem yapar

    //encapsulated generate getter & setter (we can able to read and write this side)outside the class. it returns the value
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0){
            System.err.println("Invalid Side? " +side);
            System.exit(1);
        }
        this.side = side;//the parameter value assign the side
    }

    public Square(double side) {
        super("Square");
        setSide(side);//check the requirement(yukaridaki if ile hazirlanan requirement i kontrol edicek)kosul varsa mutlaka setter(setSide())yazmamiz lazim kosula gore ilerlemesi gerekiyor cunku
    }
   //yada bu sekilde yazabiliriz
    /*X
    public Square(String name, double side) {
        super(name);
        setSide(side);//check the requirement(yukaridaki if ile hazirlanan requirement i kontrol edicek)kosul varsa mutlaka setter(setSide())yazmamiz lazim kosula gore ilerlemesi gerekiyor cunku
     */

//burdan sonra da square in area ve perimeter i bulmak icin formulunu yazacagiz(eger override area ve peremeter yapmazsak sonuc degeri 0 olur parent class da 0 degerini verdigimiz icin
//override methodu right click generate OverrideMethods sec once area yi click
    @Override
    public double area() {
        //return super.area();otomatik sectigimizde bu cikiyor bunu manual olarak degistiri calculate area formulunu yaziyoruz
    return side*side;

    }
 //override methodu right click generate OverrideMethods sec once perimeter yi click

    @Override
    public double perimeter() {
       //return super.perimeter();otomatik sectigimizde bu cikiyor bunu manual olarak degistiri calculate perimeter formulunu yaziyoru
    return side*4;
    }
    //burdan sonra da toString method olustumamiz lazim right click generate hen toString Method.manual olarak istedigimiz olustudugumuz area ve perimeter bilgilerinide giricegiz
     @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area='" + area() + '\'' +//manual olarak ekledik bu kismi
                ", perimeter='" + perimeter() + '\'' +//manuel olarak ekledik bu kismi
                '}';



    }
}
/*
Square extends Shape:
	variables:
		side;

	Encapsulate the field

	Add a constructor to set the filed

	area(): side * side
	perimeter(): side * 4
	toString(): side, area, perimeter
 */
