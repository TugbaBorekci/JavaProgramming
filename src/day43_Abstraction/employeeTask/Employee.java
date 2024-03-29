package day43_Abstraction.employeeTask;

public abstract class Employee extends Person {

   //unique variable lari hazirliyoruz her bir calisan icin
    private final int id;
    private String jobTitle;
    private double salary;

    //4-constructor yapiyoruz
    public Employee(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender);
        if(id <= 0){
            throw new RuntimeException("Invalid ID: "+id);
        }
        this.id = id;
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    //3-getter & Setter methodlarini generete yapiyoruz
    public int getId() {
        return id;
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

//2-employee class  icin abstract method hazirliyoruz
    public abstract void work();

    public String toString() {
        return "Employee{" +
                "name=" + getName() +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
