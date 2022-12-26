package day40_FinalKeyword;

public final class Dog extends Animal {

//constructor yapmamiz lazim once
    public Dog(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }

//SETTER olanlar declare final oldugu icin unchangeable
    //if we call eat() method we can implementation // (eating dog food) we need to override
    public void eat(){
        System.out.println(getName()+ " is eating dog food");//seklinde override yaparak degistirdik.subclass da bu sekilde yaziyordu System.out.println(name+" is eating");
    }

  /*
    public void drink(){
        System.out.println(getName()+ " is drinking beer");seklinde degistiremeyiz final keyword kullanildigi icin.final method can not be overriden.yazdigimiz zaman hata veriyor.

   */

    //dog a ozel bark metodu kullanabiliriz
    public void bark(){
        System.out.println(getName()+" is barking");
    }


    }

