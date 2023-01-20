package day43_Abstraction.employeeTask;

public class Tester extends Employee{

    //constructor olusturuyoruz
    public Tester(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }
    //1-override method to parrent class
    @Override
    public void work() {
        System.out.println(getName()+" is testing the application");//sonra icine yazmak istedigimizi ekleyebiliyoruz
    }
    //2-override method to parrent class
    @Override
    public void sleep() {
        System.out.println(getName()+" sleeps 8 hours");//sonra icine yazmak istedigimizi ekleyebiliyoruz
    }

    //3-sadece bu sinifa ozel method yazabiliyoruz
    public void bugReport(){
        System.out.println(getName()+" is creating bug reports");
    }

}
