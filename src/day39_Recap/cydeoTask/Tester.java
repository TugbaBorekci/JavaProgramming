package day39_Recap.cydeoTask;

public class Tester extends Employee {

    //create constructor
     public Tester(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    public void createTicket(){
        System.out.println(getJobTitle() + " "+getName()+" is creating ticket");
    }

}
/*
3. Create a sub class of Employee named Tester

            Override the work method

            Extra methods:
                createTicket()
 */
