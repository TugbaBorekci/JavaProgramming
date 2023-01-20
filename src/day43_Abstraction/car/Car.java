package day43_Abstraction.car;

public class Car {

//sadece bu sekilde yazip getter ve setter yaptigimizda compile time error hala hata veriyor o yuzden constructor yapmamiz lazim
    private final String brand, model;
    private String color;
    private final int year;
    private double price;


    //constructor yapiyoruz all instance include now.yukarida cte artik vermiyor
    public Car(String brand, String model, String color, int year, double price) {
        this.brand = brand;
        this.model = model;
        //this.color = color;setter da bunu verdigimiz icin degistiriyoruz ve condition i yaziyoruz
        setColor(color);
        if(year < 1886){
            throw new RuntimeException("Invalid Year: " +year);
        }//before check setting year so we wrote before condition
        this.year = year;
        //this.price = price;setter da bunu verdigimiz icin degistiriyoruz
        setPrice(price);//condition i setter in altina yazdigimiz icin buraya yazmaya gerek yok
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {

        if (price <= 0){
            throw new RuntimeException("Invalid price:  "+price);
        }
        this.price = price;
    }
}