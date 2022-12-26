package day37_Inheritance.phoneTask;

public final class Iphone extends Phone{


    public Iphone( String model, String size, double price, String color) {
        super("Apple", model, size, price, color);
    }

    public final void faceTime(long phoneNumber){//final yazisi mavi degil gri rengine dondu java necessary olmadigini dusundugu icin cunku class final ayriva urda kullanmaya gerek yok
        System.out.println(brand + " " + model + " " + " is having a Face Time with phone number: " + phoneNumber);
    }

    public void faceTime(String email){//overload here .same method name faceTime() but different parameters.any method in java we can overload
        System.out.println(brand + " " + model + " is having a Face Time with email: " + email);
    }


}


/*
 1.2 Create a subclass of Phone named IPhone:
                Variables:
                    brand, model, size, price, color
                Methods:
                    call(long phoneNumber)
                    text(long phoneNumber)
                    faceTime(long phoneNumber)
                    faceTime(String email)
                    toString()
 */