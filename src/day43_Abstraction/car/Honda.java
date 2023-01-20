package day43_Abstraction.car;

public class Honda extends Car { //once parent classdan extends yapiyoruz attributes leri aliyoruz


//constroctor yapiyoruz ama hala cte veriyor class ismi
    public Honda(String model, String color, int year, double price) {
        super("Honda", model, color, year, price);
    }
    //hala cte verdigi icin parent classtaki abstract method u override yapiyoruz buraya it is mendotory

    public void start(){
        System.out.println("Twist the key to ignition");
    }

}
