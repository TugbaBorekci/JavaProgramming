package week18_01_07_2023.exception;

public class DisAdvantageOfThrows {

    public static void main(String[] args) throws InterruptedException {

            //try & catch short way
        //mac:commend + alt + T
        //windows: ctrl + alt + T
        waitFor(3);
        sleep(4);
    }
    public static void sleep(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {

        }
    }

    private static void waitFor(int seconds) throws InterruptedException {
        sleep(seconds*1000);
    }
    public static void methodA() throws InterruptedException {
        waitFor(4);

    }



}
