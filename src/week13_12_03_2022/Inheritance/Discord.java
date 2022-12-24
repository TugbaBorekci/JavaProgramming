package week13_12_03_2022.Inheritance;

public class Discord extends MobileApp{

    public Discord(double version) {
        super("Discord", version);
    }

    public void chat(){
        System.out.println("the user is chatting ....");
    }
}
