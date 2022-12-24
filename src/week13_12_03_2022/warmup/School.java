package week13_12_03_2022.warmup;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class School {


    static ArrayList<Teacher> teachers = new ArrayList<>();// eger static yapmazsak hata veriyor

    static {//once teacher objectleri create yapiyoruz sonra initilaze  teacher variable yapiyoruz static blogun icine
        Teacher teacher1 = new Teacher("Muhtar", "Abc", 'M', LocalDate.of(1987, 1, 1), 1L);
        Teacher teacher2 = new Teacher("Gurhan", "Abc", 'M', LocalDate.of(1977, 1, 1), 2L);
        Teacher teacher3 = new Teacher("Aysun", "Abc", 'F', LocalDate.of(1967, 1, 1), 3L);
        Teacher teacher4 = new Teacher("Mike", "Abc", 'M', LocalDate.of(1970, 1, 1), 4L);
        Teacher teacher5 = new Teacher("Saim", "Abc", 'M', LocalDate.of(1989, 1, 1), 5L);
        Teacher teacher6 = new Teacher("Asya", "Abc", 'F', LocalDate.of(1990, 1, 1), 6L);

        teachers.addAll(Arrays.asList(teacher1, teacher5, teacher2, teacher3, teacher4, teacher6));//initilaze yapmak icin bunu blogun icine koymaliyiz yoksa hata veriyor

    }

    public static void main(String[] args) {
          //teacher lari yazdirmak istedigimiz icin
        System.out.println(teachers);
        ArrayList<Teacher> result = getTeachersNameStatrtWith("M");//metot olusturup ne sitiyorsak yaziyoruz kisa yol olmasi icin
        System.out.println(result);

        ArrayList<Teacher> females = getTeachersByGender('F');
        System.out.println(females);

    }

    private static ArrayList<Teacher> getTeachersByGender(char gender) {
        ArrayList<Teacher> result = new ArrayList<>();

        //need to get teachers one by one
        for (Teacher teacher : teachers) {

            //check the gender if it is female
            if (teacher.gender == gender)

                //put in result
                result.add(teacher);

        }

        return result;

    }

    private static ArrayList<Teacher> getTeachersNameStatrtWith(String prefix) { //kisayoldan alt+Enter a basarak burayi olusturuyoruz ve yukardaki yer aktiflesiyor hata veermiyor
        ArrayList<Teacher> result = new ArrayList<>();
        //i need to get teacher one by one
        for (Teacher teacher : teachers) {

            //i need to check the name if the name is starting with"M"

            if (teacher.name.startsWith(prefix))
                //i will put inside result
                result.add(teacher);

        }
        return result;


        }

    }





/*
2. create a class which is School with main method

    3. create a list of teacher in School class inside the STATIC BLOCK

    4. create a method in School class which is returning the list of teachers if the last name start with "M"

    5. create a method in School class then you will find the female teachers

    6. create a method in School class then find the teachers age smaller than 30

    7. create a methot in School class then find the teachers born in 1967 year
 */