package day30_CustomClass;

import java.util.ArrayList;

 //customObject Class da main methodu yapiyoruz run yapiyoruz.daha once create yapilan objectleri assign yapip kullaniyoryuz
    public class DogObjects {

        public static void main(String[] args) {

            Dog dog1  = new Dog();

            dog1.name = "Lucy";
            dog1.breed = "Husky";
            dog1.age = 5;
            dog1.gender = 'F';
            dog1.size = "Small";
            dog1.color = "White";
            //konsolda Dog{name='Lucy', breed='Husky', age=5, gender=F, size='Small', color='White'}


            Dog dog2 = new Dog();

            dog2.name = "ACE" ;
            dog2.breed = "Husky";
            dog2.age = 5;
            dog2.gender = 'M';
            dog2.size = "Large";
            dog2.color = "White & Black";

            //Konsolda Dog{name='ACE', breed='Husky', age=5, gender=M, size='Large', color='White & Black'}

           //easier way setInfo() metodu ile calling yapiyoruz kodu bu sekilde de yazabiliriz.dog class ina setInfo metod icin siralama kodunu yapmistik.burda yazdigimiz zaman sirasiyla dog class a kaydettigimiz sekliyle gelicek
            Dog dog3 = new Dog();
            dog3.setInfo("Jack", "German Shepard", 2, 'M', "Large", "Black");

            System.out.println(dog1);
            System.out.println(dog2);
            System.out.println(dog3);//Dog{name='Jack', breed='German Shepard', age=2, gender=M, size='Large', color='Black'}

            dog1.eat();

            dog2.bark();

            Dog dog4 = new Dog();
            dog4.setInfo("Bullet", "Labrador", 3, 'M', "Extra Large", "Yellow");

            Dog dog5 = new Dog();
            dog5.setInfo("Sully", "Pit-Bull", 6, 'M', "Large", "Black");

            System.out.println("-----------------------------------");

            Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};

            ArrayList<Dog> femaleDogs =new ArrayList<>();//make with loop
            ArrayList<Dog> maleDogs =new ArrayList<>();//make without loop





        }


    }

