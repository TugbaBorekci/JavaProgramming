package day28_ArrayList;

import java.util.Arrays;

public class StrongPassword {
    public static void main(String[] args) {

        String password = "Cydeo1990@";//"Cydeozxc@" if password ther is no digits it gives result false
        boolean r1 = password.length() >= 8 && !password.contains(" ");//en az 8 karakter olsun ve passwordde space olmasin
        boolean r2 = false;//temporary value for boolean expression(has upper case)
        boolean r3 = false;//temporary value for boolean expression(has lower case)
        boolean r4 = false;//temporary value for boolean expression(has special character)
        boolean r5 = false;//temporary value for boolean expression(has digit)


        char[] chars = password.toCharArray();
        //System.out.println(Arrays.toString(chars)); karakterleri tek tek ayirmak istersen bu kodu kuklanip yazdiriyoruz


        for (char each : chars) { // for each loop ile tum karakterleri tek tek kontrol edicek

            if (Character.isUpperCase(each)) {
                r2 = true;
            } else if (Character.isLowerCase(each)) {
                r3 = true;
            } else if (Character.isDigit(each)) {
                r5 = true;
            } else { //if special character
                r4 = true;

            }
       /* this is optional.eger bir tane false varsa digerlerini kontrol etmeye gerek yok
            if (r2 && r3 && r4 && r5){
                break;
           */
        }

        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
        System.out.println("isStrongPassword = " + isStrongPassword);

    }



    //create  custom method
    public static boolean isStrongPassword(String password){
        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false; // has upper case
        boolean r3 = false; //has lower case
        boolean r4 = false; //has special char
        boolean r5 = false; // has digit

        char[] chars = password.toCharArray();

        for (char each : chars) {

            if(Character.isUpperCase(each)){
                r2 = true;
            }else if(Character.isLowerCase(each)){
                r3 = true;
            }else if(Character.isDigit(each)){
                r5 = true;
            }else{ // special char
                r4 = true;
            }

        }

        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
        return isStrongPassword;
    }





}


/*
1.Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
        1.1 Password must be at least have 8 characters long, and should not contain space
        1.2 PassWord should at least contain one upper case letter
        1.3 PassWord should at least contain one lower case letter
        1.4 Password should at least contain one special characters
        1.5 Password should at least contain a digit

 */