package week13_12_03_2022.warmup;

import java.time.LocalDate;

public class Teacher {
    public String name;
    public String lastName;
    public char gender;
    public LocalDate dateOfBirth;
    public int age;
    public long id;
/*
               mac:      command+N for seeing options for Constructor and toString
               windows:   Alt+insert for seeing options for Constructor and toString
 */


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public Teacher(String name, String lastName, char gender, LocalDate dateOfBirth, long id) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        //how we get to date for today
        int currentYear=LocalDate.now().getYear();//2022
        int yearOfDateOfBirth=dateOfBirth.getYear();
        this.age=currentYear-yearOfDateOfBirth;

    }


    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                ", id=" + id +
                '}';

    }



}





/*
Task 1 :



     1. create a class named Teacher that has the followings features:
            Attributes:
                name,lastName, gender, dateOfBirth(use LocalDate), age, id

            Methods:

                sets all the attributes of the teacher object
                toString(): returns the full info of teacher Object



 */
