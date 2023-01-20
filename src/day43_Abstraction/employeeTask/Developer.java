package day43_Abstraction.employeeTask;

public class Developer extends Employee{


    //constructor olustruyoruz
    public Developer(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    //parent class tan override yapiyoruz methodu
    @Override
    public void work() {
        System.out.println(getName()+" is developing application");
    }

    //parent class tan override yapiyoruz methodu
    @Override
    public void sleep() {
        System.out.println(getName()+" sleeps 6 hours");
    }

    //developer class ina ozel method hazirliyoruz
    public void unitTest(){
        System.out.println(getName()+" is unit testing");
    }

}
