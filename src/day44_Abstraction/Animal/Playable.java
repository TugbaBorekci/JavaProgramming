package day44_Abstraction.Animal;

public interface Playable {

    boolean isFriendly = true; // static & final by default

    /*
    public static void method1(){
        System.out.println(isFriendly);
    }
    */

    void play(); // abstract by default

}
