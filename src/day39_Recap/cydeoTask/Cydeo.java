package day39_Recap.cydeoTask;

public class Cydeo {
    public static void main(String[] args) {

        //create object
        Developer developer = new Developer("Korkmaz", 29,'M',1, "Java Developer",125000);

        Tester tester = new Tester("Olga", 27, 'F', 2, "SDET", 110000);

        Teacher teacher = new Teacher("Daniel", 32, 'M', 3, "Math Teacher", 100000);

        Student student = new Student("Suhaib", 30, 'M', 8, "SDET" );

        //hazirlanan object ler icin print statement hazirla
        System.out.println(developer);//Employee{name='Korkmaz', age=29, gender=M, employeeID=1, jobTitle='Java Developer', salary=125000.0}
        System.out.println(tester);//Employee{name='Olga', age=27, gender=F, employeeID=2, jobTitle='SDET', salary=110000.0}
        System.out.println(teacher);//Employee{name='Daniel', age=32, gender=M, employeeID=3, jobTitle='Math Teacher', salary=100000.0}
        System.out.println(student);//Student{name='Suhaib', age=30, gender=M, studentId=8, fieldOfStudy='SDET'}


        System.out.println("-----------------------------------------------------------------");

        developer.setAge(39);

        System.out.println(developer.getAge());//39

        System.out.println(developer);//Employee{name='Korkmaz', age=39, gender=M, employeeID=1, jobTitle='Java Developer', salary=125000.0}

        System.out.println("-----------------------------------------------------------------");

        developer.work();
        tester.work();
        teacher.work();
        //  student.work();

        System.out.println("------------------------------------------------------------");

        developer.eat();
        developer.drink();
        developer.sleep();

        developer.fixingBugs();

        System.out.println("------------------------------------------------------------");

        tester.eat();
        tester.drink();
        tester.sleep();

        // tester.fixingBugs();
        tester.createTicket();

        System.out.println("------------------------------------------------------------");

        teacher.eat();
        teacher.drink();
        teacher.sleep();

        //teacher.fixingBugs();
        //teacher.createTicket();

        System.out.println("------------------------------------------------------------");

        student.eat();
        student.drink();
        student.sleep();

        // student.fixingBugs();
        // student.createTicket();
        student.study();

    }
}
