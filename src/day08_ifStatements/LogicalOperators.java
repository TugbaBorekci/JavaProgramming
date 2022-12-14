package day08_ifStatements;

public class LogicalOperators {
    public static void main(String[] args) {

        // Logical && AND  Operators
        String name = "Steven";
        int age = 19;
        String citizen = "UK";

        boolean isEligible = age >= 18 && citizen =="USA";
        //                    19 >= 18 && "UK"== "USA"
        //                       true  &&  false===>false

        System.out.println( name + " is eligible to vote: " +isEligible);

        System.out.println("---------------------------------");

        String name2 = "Josh";
        int creditScore = 720;
        int age2 = 23;

        boolean isEligible2 = creditScore >= 700 && age2 >= 21 ;
        //                          720   >= 700 &&   23 >= 21
        System.out.println( name2+" is eligible for loan: "+isEligible2);

        System.out.println("---------------------------------");

        String name3 = "John";
        int creditScore2 = 800;
        int age3 = 17;
        int income = 70000;

        boolean isEligible3 = creditScore2 >= 700 && age3 >= 21 && income >= 60000 ;
        //                          800   >=  700 &&   17 >= 21 && 70000  >= 60000

        System.out.println( name3+" is eligible for loan: "+isEligible3);

        System.out.println("---------------------------------");

        String name4 = "Shay";
        int age4 = 21;
        char gender = 'F';

        boolean isEligible4 = age4 >= 18 && (gender == 'M' || gender == 'F');
        //                      21 >= 18 && ( 'F' == 'M'  //  'F' == 'F')
        //                          true &&  (    false   //     true   )
        //                          true &&   true
        //                              true

        System.out.println( name4 + " is eligible to register: " +isEligible4);

        System.out.println("---------------------------------");

        // Logical Or|| Operators

        String name5 = "James";
        String countryOfBirth = "UK";
        boolean marriedToUSCitizen = false;
        boolean isEligible5 = countryOfBirth == "USA" || marriedToUSCitizen == true;
        //                          false                           false

        System.out.println( name5 + " is eligible to apply for US citizenShip: " +isEligible5);


        System.out.println("---------------------------------");

        String student = "Anna";
        double gpa = 3.5;
        int familyIncome = 10000;
        boolean isEligible6 = gpa >= 3.5 || familyIncome <= 60000;
        //                        true   ||          true

        System.out.println(student + " is eligible to for scholarship: " +isEligible6);

        String student2 = "Breanna";
        double gpa2 = 2.5;
        int familyIncome2 = 400000;
        boolean isEligible7 = gpa2 >= 3.5 || familyIncome2 <= 60000;
        //                        false  ||        false

        System.out.println(student2 + " is eligible for scholarship: " +isEligible7);

        String student3 = "Ali";
        double gpa3 = 2.5;
        int familyIncome3 = 50000;
        boolean isEligible8 = gpa2 >= 3.5 || familyIncome3 <= 60000;
        //                        false  ||        true

        System.out.println(student3 + " is eligible for scholarship: " +isEligible8);

        System.out.println("---------------------------------");

        // Logical NOT ! Operators
        boolean result2 = true;
        System.out.println("result2 = " + result2);

        boolean result3 = !result2;
        System.out.println("result3 = " + result3);

        System.out.println("---------------------------------");
        int score = 85;
        boolean passed = score >= 60;
        boolean failed = !passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);

        System.out.println("---------------------------------");

        int score2 = 55;
        boolean passed2 = score >= 60;
        boolean failed2 = !passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);

        System.out.println("---------------------------------");











    }
}
        /*
       Logical && AND Operators
        ture = false ==> false
        false = false ==> false
        false = true ==> false
        true = true ==> true
         */

        /*
        Logical || Operators
        true = true ==> true
        true = false ==> true
        false = true ==> true
        false = false ==> false
         */