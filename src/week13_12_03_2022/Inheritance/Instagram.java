package week13_12_03_2022.Inheritance;

public class Instagram extends MobileApp{//sadece bunu yazinca hata veriyor constructor yapmamiz lazim

    public Instagram(double version){
        super("Instagram",version);
    }

    public  void postPhoto(){
        System.out.println("The user is posting photo");
    }

    /*
    public  Instagram(){
       super();
    }
    */



    /*
    instead of that one I need to use extends keyword and MobileApp
  public   String name;
  public  double version;
    public void useTheApp(int minutes){
        System.out.println("The user is using " + name + " application for " + minutes + " minutes");
    }
    public  void  download(){
        System.out.println(name + " application is downloading by the user.");
    }
    public String toString() {
        return "MobileApp{" +
                "name='" + name + '\'' +
                ", version=" + version +
                '}';
    }
    */

}

