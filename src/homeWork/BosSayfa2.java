package homeWork;



public class BosSayfa2 {


public BosSayfa2(){
    System.out.println("A");
}
public BosSayfa2(int a){
    this(2.5);
    System.out.println("B");
}
public BosSayfa2(double c){
    this();
    System.out.println("C");
}

    public static void main(String[] args) {
        BosSayfa2 bsf = new BosSayfa2(100);
    }

}



