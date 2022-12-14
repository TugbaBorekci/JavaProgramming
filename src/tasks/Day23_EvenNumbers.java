package tasks;

public class Day23_EvenNumbers {
    public static void main(String[] args) {
       
        evenNumber();
    }
    //create a method that can print even numbers between 1~100 in a same line separated by space
        public static void evenNumber(){

            for (int i = 2; i < 100; i+=2) {
                System.out.print(i+" ");
                
            }
        
}
}
