package day06_PrimitiveTypeCastings;


import java.time.LocalDate;

public class HappyBirthDay {

    public static void main(String[] args) {

    }

    public static void happyBirthday(int year, int month, int day){
        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();

        int month2 = today.getMonthValue();
        int day2 = today.getDayOfMonth();

            System.out.println("Today is your birthday!!!");
            System.out.println("   /n /t /t /t /t     * * * * * * * * * * * * * * * * * * * * *");
            System.out.println("   /t /t /t /t  * * * * * * * * * * * * * * * * * * * * * * * *");
            System.out.println("  /t /t /t /t  * *                                             ");
            System.out.println("  /t /t /t /t  * *                                             ");
            System.out.println("  /t /t /t /t  * *                                             ");
            System.out.println("  /t /t /t /t  * *                                             ");
            System.out.println("  /t /t /t /t  * *                                             ");

        }

    }












