package day35_Encapsulation.encapsulation.CredentialTask;

public class Credentials {

    public String username;
    public String password;

    public Credentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static boolean isStrongPassword(String password){
        boolean r1 = password.length()>=8 &&!password.contains(" ");
        boolean r2 = false;
        boolean r3 = false;
        boolean r4 = false;
        boolean r5 = false;
        for (char each : password.toCharArray()) {

            if (Character.isLetter(each)) {
                r2 = true;
            } else if (Character.isDigit(each)) {
                r3 = true;

            } else {
                r4 = true;

            }

        }
        return r1 && r2 && r3 && r4;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void main(String[] args) {

            System.out.println(isStrongPassword("klAsd124@"));

        }


    }


/*
2. create a class named Credentials
            Variables:
                username, password

            Methods:
                isStrongPassWord(): takes an argument of string and verify if the given string is strong password
                            Characteristics of strong passwords are:
                                    1. Password MUST be at least have 8 characters long, and should not contain space
                                    2. PassWord should at least contain one letter
                                    3. Password should at least contain one special characters
                                    4. Password should at least contain a digit

                getPassword(): reads the password
                getUsername(): reads the username
                setUsername(): sets the username
                setPassword(): sets a new password
                                    the new password MUST be a strong password

                toString():

            Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)



 */