package day24_CustomMethods_Return;

public class BreakfastTasks {
    public static void main(String[] args) {

        initials("cydeo", "school");//basharflerini yazicak

        System.out.println("----------------------------------------");

        domain("Cydeo.School@amazon.com");

        System.out.println("----------------------------------------");

        String[] emails = { "josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com"};

        for (String email : emails) {
            domain(email);
        }
        System.out.println("----------------------------------------");

        nameOfMonth(1);

        System.out.println("----------------------------------------");

        nameOfDay(3);



    }

   //1. Create a method that can display the initials of the person. Initials(String firstName, String lastName)
        public static void initials(String firstName, String lastName) {

          String initial = firstName.charAt(0) + "." + lastName.charAt(0);

          initial = initial.toUpperCase();//C.S

          System.out.println("initial = " + initial);

      }
   //2. Create a method that can display the domain of the email. domain(String email)
         public static void domain(String email){ //Cydeo.School@gmail.com

              String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
              System.out.println("domain = " + domain);
 }

    // 3. Create a method that can display the name of the month based on the given number to the method
          public static void nameOfMonth(int number){

        String name = "";

        if (number >= 1 && number <= 12){

            name = (number==1)?"Jan" :(number==2)?"Feb" :(number==3)?"Mar" :(number==4)?"Apr"
                   :(number==5)?"May" :(number==6)?"Jun" :(number==7)?"Jul" :(number==8)?"Aug"
                   :(number==9)?"Sep" :(number==10)?"Oct" :(number==11)?"Nov" :"Dec";
              }else {
            name = "Invalid";
        }
              System.out.println("Month name = " + name);
    }

    // 4. Create a method that can print the name of the day based on the given number to the method

         public static void nameOfDay(int number){

        String name = "";

        if (number >= 1 && number <= 7){

            name = (number==1)?"Mon" :(number==2)?"Tue" :(number==3)?"Wed" :(number==4)?"Thu"
                    :(number==5)?"Fri" :(number==6)?"Sat" :"Sun";
        }else {
            name = "Invalid";
        }
        System.out.println("Day name = " + name);

    }

    // 5. Create a method that can print how many days a month has(githab a bakarak yap oraya yuklendi)

        public static void daysInMonth(int number){

          String day="";




    }

    // 6. Create a method that can print age groups

}

/*
    Warmup tasks
    1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has

	6. ageGroups
 */