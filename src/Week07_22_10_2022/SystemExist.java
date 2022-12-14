package Week07_22_10_2022;

public class SystemExist {
    public static void main(String[] args) {
/*
        for (int i = 0; i <= 5; i++) {

            if (i==3)
               break;//012 after break yazicak verilen komutu gorucek (i==3) ve outside daki statemenlari da gorucek
               // System.exit(0); //kulanirsan 012 yazicak sadece sonra verilen komutlari (statementlari) gormiyecek
            System.out.println(i);

        }
           System.out.println("after break");



*/
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (j==3){
                    break;
                }
                System.out.println(i + " _ " +j);
            }

        }
        System.out.println("after break");

    }

}

