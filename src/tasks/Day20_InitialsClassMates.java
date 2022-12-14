package tasks;

public class Day20_InitialsClassMates {

    public static void main(String[] args) {

        String[] classmates = {"Arzu Kizilari", "Asiye Akpinar", "Abdullah Sagir", "Aysegul Celik", "Serpil Eyuboglu",
                "Ambreen Dad", "Mutullah Demir", "Mustafa Aydin", "Nilay Soni", "Nurdan Kilic"};


        for (int i = 0; i < classmates.length; i++) {

            String initial = classmates[i].charAt(0) +"."+ classmates[i].charAt(classmates[i].indexOf(" ") + 1);
            System.out.println(initial);

        }




    }

}
/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmate's in separate lines
 */

