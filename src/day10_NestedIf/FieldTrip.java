package day10_NestedIf;

public class FieldTrip {
    public static void main(String[] args) {

        int grade = 2;
        String location = "";
        int groupNumber = 0;
        String teacher = "";


        if (grade >= 1 && grade <= 6) {
            if (grade == 1) {
                location = "Apple orchard";
                groupNumber = 3;
                teacher = "Ms. Smith";
            } else if (grade == 2) {
                location = "Zoo";
                groupNumber = 7;
                teacher = "Mr. Lee";
            } else if (grade == 3) {
                location = "Aquarium";
                groupNumber = 5;
                teacher = "Ms. Wilson";
            } else if (grade == 4) {
                location = "Movie theater";
                groupNumber = 2;
                teacher = "Ms.Reyes";
            } else if (grade == 5) {
                location = "Museum";
                groupNumber = 5;
                teacher = "Ms.Lela";
            } else if (grade == 6) ;
            location = "Six Flags";
            groupNumber = 8;
            teacher = "Mr. Watt";

        }

        System.out.println("location - " + location + "\nnumber of groups - " + groupNumber + "\nteacher in charge -" + teacher);



}



        }
