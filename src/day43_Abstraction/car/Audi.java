package day43_Abstraction.car;

public final class Audi extends Car {

   //2-generate constructor
    public Audi( String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }

    //first override parent class(parent class in gorevi bu methodu olusturmak., ama icini doldurmak child clsass da yapiliyor
    public void start() {
        System.out.println("Push the start button");
    }

    public void autoPark(){ //it is instance method Audi ye ozel parent class da yok
        System.out.println(getBrand()+" "+getModel()+" has auto park feature");
    }

}
