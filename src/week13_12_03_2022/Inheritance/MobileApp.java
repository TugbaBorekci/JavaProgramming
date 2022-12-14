package week13_12_03_2022.Inheritance;

public class MobileApp {

    public String name;
    public double version;

    public MobileApp(String name, double version) {
        this.name = name;
        this.version = version;
    }
public void useTheApp(int minutes){
    System.out.println("The user is using " + name + "application for" + minutes + "minutes");

}

public void download(){
    System.out.println(name + "application is downloading by the user.");

}

    @Override
    public String toString() {
        return "MobileApp{" +
                "name='" + name + '\'' +
                ", version=" + version +
                '}';
    }
}
