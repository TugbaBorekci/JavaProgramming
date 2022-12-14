package day30_CustomClass;

public class Employee {
    public String name;
    public char gender;
    public int age;
    public int id;
    public String jobTitle;
    public double salary;
    public boolean isFullTime;


//kisayolu sag click Generate choose tuString() hangi bilgileri istiyorsan hepsini sec ok e bas sonra public ten sonra void setInfo yaz()
    public void setInfo(String name, char gender, int age, int id, String jobTitle, double salary, boolean isFullTime) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

//kisayolu sag click Generate choose toString() hangi bilgileri istiyorsan hepsini sec ok e bas
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void work(){
        System.out.println(jobTitle+" "+name +" is working");
    }


}

/*
Employee Class:
		Attributes:
			name, id, gender, jobTitle, salary, isFullTime(boolean)
		Actions:
			toString(): to be able to print each employee object
			setInfo(): to be able to set all the attributes
			work()...
 */

