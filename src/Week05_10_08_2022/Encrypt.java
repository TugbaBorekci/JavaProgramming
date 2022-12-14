package Week05_10_08_2022;

public class Encrypt {
    public static void main(String[] args) {
        /*Task 9: Given a string password. Encrypt with "x" a given password and print.
           Hint: do with for loop
               * password: Cydeo
             * encrypt with char :X
            * output:CXyXdXeXoX
         */
//first solution
        String password="Cydeo";
        char encryptWith='X';
        String encryptedPassword="";
        for (int i = 0; i < password.length(); i++) {
            encryptedPassword+=""+password.charAt(i)+encryptWith;
            //1.iter CX               2.iter y    +   X =yX
        }
        System.out.println(encryptedPassword);









    }
}
