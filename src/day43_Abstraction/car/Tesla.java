package day43_Abstraction.car;

public final class Tesla extends Car {


    //constructor yapiyoruz
    public Tesla( String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    //first override yapiyoruz abstract method u parent class dan
    public void start() {
        System.out.println("Say \"start\"");
    }

    //tesla ya ozel instance method olusturuyoruz
    public void autoPilot(){
        System.out.println(getBrand()+" "+getModel()+" has auto pilot feature");
    }
}
