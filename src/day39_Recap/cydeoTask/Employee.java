package day39_Recap.cydeoTask;

public class Employee extends Person {

    //first create instance variables
    private int employeeID;
    private String jobTitle;
    private double salary;

    //create constructor
    public Employee(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender);
        setEmployeeID(employeeID);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

        //create generator getter & setter
    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
            System.out.println(getName()+" is  working");
        }


    //create toString method
  @Override
         public String toString() {
            return "Employee{" +
                    "name='" + getName() + '\'' +
                    ", age=" + getAge() +
                    ", gender=" + getGender() +
                    ", employeeID=" + employeeID +
                    ", jobTitle='" + jobTitle + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }

/*
 2. Create a sub class of Person named Employee:
            Extra variables:
                employeeId, jobTitle, salary

            Encapsulate all the fields

            Add a constructor to set all the fields

            Methods:
                work()
                toString()

 */