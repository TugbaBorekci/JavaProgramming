package day38_Inheritance.carTask;

public class Toyota extends Car {

    public Toyota(String model, int year, double price, String color, int mile) {
        super("Toyota", model, year, price, color, mile);


    }
    public void reliable(){

        System.out.println(brand+" "+model+" is reliable");
    }


}

/*
1. Toyota:
					extra methods:
							reliabile()

 */