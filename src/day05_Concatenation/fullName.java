package day05_Concatenation;

public class fullName {

    public static void main(String[] args) {

        String firstName = "Aron";
        String lastName = "Daniel";
        int age = 19;
        String jobTitle = "Senior SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;





        String fullName = firstName + " " + lastName;

        // Full name of the person is _________
        System.out.println("Full Name of the person is " + fullName);

        // ____ is __ years old
        System.out.println(fullName + " is " + age + " years old ");

        // FullName is JobTitle, works at CompanyName, and FullName' salary is Salary
        System.out.println(fullName + " is " +  jobTitle +", works at " + companyName
                +", and "+fullName +"'s salary is $"+salary);



    }

}
