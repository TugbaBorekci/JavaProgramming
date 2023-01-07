package day42_Exceptions;

class FadyException extends RuntimeException{//custom unchecked exception


    //class FadyException extends RuntimeException this is custom on check exception.burasi main method un icindeki RuntimeException class in run yapilmasini sagliyor
    public FadyException(){
        super("Time for a short break");
    }

    public FadyException(String message){
        super(message);
    }

}

class NoBreakException extends RuntimeException{///custom unchecked exception
    //NoBreakException--->this is unchecked exception e-->extend RunTimeException yapiyoruz main method icindeki message yazdirsin diye
}

public class CustomException {

    public static void main(String[] args) {

      // throw new FadyException();//default constructor oldugunda Process finished with exit code 1.xception in thread "main" day42_Exceptions.FadyException (create breakpoint)

        //throw new FadyException("It's time for short break");//Process finished with exit code 1.xception in thread "main" day42_Exceptions.FadyException It's time for short break message i yazdiriyor
        //throw new FadyException("It's time for lunch break");//Process finished with exit code 1.xception in thread "main" day42_Exceptions.FadyException It's time for lunch break message i yazdiriyor

        try {
            throw new NoBreakException();

            }catch (NoBreakException e){
            e.printStackTrace();
        }

    }
}
