package day11_Switch_Scanner;

public class Grade2 {
    public static void main(String[] args) {

        char ch = 'E';
        String result = "";
        switch (ch){

            case 'A':
            case 'B':
            case 'C':
            case 'D':
                result = "Passed";
                break;
            case 'E':
                result = "Failed";
                break;
            default:
                result = "Invalid";
        }
            System.out.println(result);

    }
}
/*
            //yanyana yazabiliriz caselleri
            case 'A':case 'B':case 'C': case 'D':
                result = "Passed";
                break;
            case 'E':
                result = "Failed";
                break;
            default:
                result = "Invalid";
 */




/*
if the grade A or B or C or D ======>"Passed"
otherwise ========>"Failed"
 */