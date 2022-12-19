package day39_Recap.cydeoTask;

public class Teacher extends Employee{

    //create constructor
public Teacher(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    //create override method

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is teaching");
    }
}
/*
 5. Create a sub class of Employee named Teacher

            Override the work method

 */