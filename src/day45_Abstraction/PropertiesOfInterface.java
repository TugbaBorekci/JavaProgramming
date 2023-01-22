package day45_Abstraction;

public interface PropertiesOfInterface {

    int a = 100; // static & final by default
    static int b = 200; // final by default

   /*
 public PropertiesOfInterface(int a){
        this.a=a;
 *///constructor for creating an object, but in interface we can  not create an object

   /*
    static {
        b = 100;
    }

    *///static block execute when the class is loaded. Static block first the run in the class. interface is  NOT class
   /*
    public void method1() {
        System.out.println("Instance method");
    }

 *///Instance method can NOT use in interface

   public static void method2(){
       System.out.println("Static method");
   }

    public abstract void method3();

     default void method4(){
       System.out.println("Default method");
   }

   class Test implements PropertiesOfInterface{

       @Override
       public void method3() {

       }

       public static void main(String[] args) {

           new Test().method4();
       }
   }

}
