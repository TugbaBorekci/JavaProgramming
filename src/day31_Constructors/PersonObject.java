package day31_Constructors;

public class PersonObject {
    public static void main(String[] args) {

        Person person1 = new Person("Daniel", 'M', 32);

        Person person2 = new Person("Ksenia", 'F', 28);

        person2.age = 30;

        System.out.println(person1);
        System.out.println(person2);




    }

}
