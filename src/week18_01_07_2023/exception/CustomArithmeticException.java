package week18_01_07_2023.exception;

public class CustomArithmeticException extends RuntimeException {

    //for mac: command + N
    //for windows: Alt + insert(ins f12 de insert)
    //if it is not working shortcut right click generate override method


    public CustomArithmeticException(String message) {
        super("You have an error with divide with 0");
    }
}
