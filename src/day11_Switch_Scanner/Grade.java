package day11_Switch_Scanner;

public class Grade {
    public static void main(String[] args) {
/*
      char ch = 'B';//==

        switch (ch){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Greet Job");
               break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'E':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid");
            }
*/
        System.out.println("-----------------------------");

            //if we want veriable result printing result

        char ch ='B';
        String result = "";

       switch(ch){
            case 'A':
                result = "Excellent";
                break;
            case 'B':
                result="Greet Job";
                break;
            case 'C':
                result="Good";
                break;
            case 'D':
                result="Passed";
                break;
            case 'E':
                result="Failed";
                break;
            default:
                result="Invalid";
        }
        System.out.println(result);

    }
}
/*
3. a char variable named grade is given. use switch statement to print the following messages:
			'A': excellent
			'B': great job
			'C': good
			'D': passed
			'F': failed
			other wise: invalid

 */