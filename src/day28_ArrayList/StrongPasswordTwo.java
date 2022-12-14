package day28_ArrayList;

public class StrongPasswordTwo {
    public static void main(String[] args) {

        String password = "cLdeo1990@";// if password = "WoodenSpoon123" result will be false,it is not strong password because there is no special character.if one condition is false it will be not strong password
        int countUpperCase = 0;
        int countLowerCase = 0;
        int countDigits = 0;
        int countSpecialChar = 0;

        //we should use regular for loop
        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);

            if(Character.isUpperCase(each)){
                countUpperCase++;
            } else if (Character.isLowerCase(each)) {
                countLowerCase++;

            } else if (Character.isDigit(each)) {
                countDigits++;

            }else{
                countSpecialChar++;
            }

        }
        System.out.println("countUpperCase = " + countUpperCase);
        System.out.println("countLowerCase = " + countLowerCase);
        System.out.println("countDigits = " + countDigits);
        System.out.println("countSpecialChar = " + countSpecialChar);

        boolean hasUpperCase = countUpperCase > 0 ;
        boolean hasLowerCase = countLowerCase > 0 ;
        boolean hasDigit = countDigits > 0 ;
        boolean hasSpecialCharacter = countSpecialChar > 0;

       /*
        boolean strongPassword = password.length() >= 8 && !password.contains(" ")
                && hasUpperCase && hasLowerCase && hasDigit && hasSpecialCharacter;
*/
       //optional bu sekilde de yapabilirsin
        boolean strongPassword = false;
        if (password.length()>= 8){
            if (!password.contains(" ")){
                if (hasUpperCase){
                    if (hasLowerCase){
                        if (hasDigit){
                            if (hasSpecialCharacter){
                                strongPassword = true;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("strongPassword = " + strongPassword);
    }
}
