package day10_NestedIf;

public class CrewPassenger {
    public static void main(String[] args) {
        int number = 75;
        String result = "";
        boolean validNumber = number == 50 || number == 75 || number == 100;

        if (validNumber){ // number:50, 75, 100
            if (number == 50) {
                result = "20 crew, 30 passengers";
            }else if (number == 75){
                result = "25 crew, 50 passengers";
            }else{
                result = "30 crew, 70 passengers";
            }

        }else {
            result = "Invalid Number";
        }

        System.out.println(result);


    }
}
