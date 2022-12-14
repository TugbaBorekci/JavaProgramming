package day15_ForLoop;

public class FormatFullName {
    public static void main(String[] args) {

        String firstName = "cyDEo",
                lastName = "SCHOOL";
       //firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();//bu sekilde de yapilabilir
                                     //C        +     ydeo ====>"Cydeo"

        firstName = (""+firstName.charAt(0)).toUpperCase() + firstName.substring(1).toLowerCase();//bu sekilde de yapilabilir
                        // "C"                                +  "ydeo ===> Cydeo

       lastName = lastName.substring(0,1).toUpperCase() +lastName.substring(1).toLowerCase();

        System.out.println(firstName);
        System.out.println(lastName);

        String fullName = firstName+" "+lastName;

        System.out.println("fullName = " + fullName);


        System.out.println("--------------------------------------------------");

        String firstName2 = "JOSH",
                lastName2 = "smITH";

        firstName2 = (""+firstName2.charAt(0)).toUpperCase() + firstName2.substring(1).toLowerCase();//bu sekilde de yapilabilir

        lastName2 = lastName2.substring(0,1).toUpperCase() +lastName2.substring(1).toLowerCase();

        System.out.println(firstName2);
        System.out.println(lastName2);

        String fullName2 = firstName2+" "+lastName2;

        System.out.println("fullName2 = " + fullName2);










    }
}
