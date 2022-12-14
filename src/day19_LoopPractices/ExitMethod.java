package day19_LoopPractices;

public class ExitMethod {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {//i:0, 1, 2, 3, 4,
            if (i == 3){
                //break;//3 e kadar yazicak 0, 1, 2 WoodenSpoon u da yazicak sonra loop u durdurucak Terminates the Loop
                //continue;//3 u atlayip 0, 1, 2, 4,  devam edicek yazmaya Wooden Spoon u da yazicak.Terminates the current iteration of the Loop
                System.exit(0);//Terminates the program 0, 1, 2, yazicak sadece sonra programi durdurack
            }
            System.out.println(i);
        }
        System.out.println("Wooden Spoon");

    }
}
