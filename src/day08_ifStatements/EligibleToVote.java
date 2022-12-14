package day08_ifStatements;

public class EligibleToVote {
    public static void main(String[] args) {

     String name = "Josh";
     int age = 38;
     String citizen = "USA";

     boolean isEligible = age >= 21 && citizen == "USA"; //true
     //                      true   &&      true

     //Eligible
     if (isEligible){ //true
         System.out.println("Eligible");
     }

     //Not Eligible
      if (!isEligible){ //!true ==> false
          System.out.println("Not Eligible");
      }



    }
}
