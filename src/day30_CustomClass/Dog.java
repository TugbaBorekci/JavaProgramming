package day30_CustomClass;

//custom class da main method olmuyor run yapmiyoruz sadece object leri olusturuyoruz kaydediyoruz
public class Dog {
    public String name;
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String color;

    public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor){
        name = dogName;
        breed = dogBreed;
        age = dogAge;
        gender= dogGender;
        size = dogSize;
        color = dogColor;
    }


    public void eat(){
        System.out.println(name+" is eating");
    }

    public void bark(){
        System.out.println(name+" is barking");
    }

    public String toString() {//ONEMLI = toString method u yapmazsak object class da yazdirma yapmak istedigimizde hascode yazar sonucu vermez.Hangi bilgilerin yazilmasini istiyorsan buraya eklemen lazim
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


}
/*
Attributes:
    name, age, gender, breed, size, color
Actions:
    eat(), play(), bark() ....
 */

