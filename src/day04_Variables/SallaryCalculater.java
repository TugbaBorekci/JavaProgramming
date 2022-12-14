package day04_Variables;

public class SallaryCalculater {

    public static void main(String[] args) {
        // hourly Rate, weeklyHours

        int hourlyRate = 65;
        int weeklyHours = 45;
        int numberOfWeeks = 52;

        int salary = hourlyRate * weeklyHours *numberOfWeeks;

        //System.out.println(salary);

        System.out.println("hourlyRate= $" + hourlyRate);
        System.out.println("weeklyHours = "+ weeklyHours);
        System.out.println("numberOf Weeks = "+ numberOfWeeks);
        System.out.println("salary= $" + salary);



    }


}
