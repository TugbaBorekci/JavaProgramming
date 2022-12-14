package week13_12_03_2022.Inheritance;

public class Instagram extends MobileApp{//saddece bunu yazinca hata veriyor constructor yapmamiz lazim

    public Instagram( double version) {//constructor .sadece double version kullandik super keyword de instagram i assign yapicagiz
        super("Instagram", version);//super keyword de Instagram i assign yaptik.
    }
    public void postPhoto(){
        System.out.println("The user is posting photo");
    }


}

