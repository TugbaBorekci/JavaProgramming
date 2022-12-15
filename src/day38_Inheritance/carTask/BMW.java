package day38_Inheritance.carTask;

public class BMW extends Car{

    public BMW( String model, int year, double price, String color, int mile) {
        super("BMW", model, year, price, color, mile);

    }

    public void breaksDown(){
        System.out.println(brand+" "+model+" is breaking down");
    }

    public void racing(){
        System.out.println(brand + " "+ model +" is a racing car");
    }
    @Override
    public void start(){
        System.out.println("Call mechanic to jump start "+brand+" "+model);
    }
}


/*
2. BMW:
					extra methods:
						breaksDown()
						racing()
 */