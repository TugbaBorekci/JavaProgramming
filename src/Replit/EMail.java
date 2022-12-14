package Replit;

import java.util.Scanner;

public class EMail {
    public static void main(String[] args) {
        /*
        Use `String methods` to divide the given `email` into separate parts. The email will always be in this format:

        #### firstName_lastName@domain.com

        Pull apart and print the first name, last name, and domain.
        When printing the values all three should be in proper capitalization format - The first letter of each word is uppercase and the rest are lowercase.
        Output in the following format:
        #### Hint: Think about how to use substring and indexOf together
        Main topics: String manipulation, Scanner, methods, primitive datatype, concatenation

         */
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String firstName, lastName, domain; //topLevelDomain(com)eger bunuda isteseydi bu sekilde yaziicakti
        int underScoreIndex, atSignIndex, dotIndex;

        underScoreIndex = email.indexOf("_");
        atSignIndex = email.indexOf("@");
        dotIndex = email.indexOf(".");

        firstName = email.substring(0, underScoreIndex);
        firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1);

        lastName = email.substring(underScoreIndex+1,atSignIndex);
        lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1);

        domain = email.substring(atSignIndex + 1, dotIndex );
        domain = domain.substring(0,1).toUpperCase()+domain.substring(1);

        //topLevelDomain = email.substring(dotIndex +1);eger bunu da isteseydi(com)

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Domain: " + domain);
        //System.out.println("topLevelDomain = " + topLevelDomain);eger bunu da isteseydi(com)




    }
}
