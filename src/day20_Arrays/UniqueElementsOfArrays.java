package day20_Arrays;

public class UniqueElementsOfArrays {
    public static void main(String[] args) {

       /*
        String[] words = {"Java", "Java", "C#", "Python", "Python"};

        for (int j = 0; j < words.length; j++) {
            String element = words[j];//"Java"
            int frequency = 0;
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(element)){
                    frequency++;
        }

            }
          if (frequency==1){
              System.out.println(element);
}

        }

*/

        String[] words = {"Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"};

        for (int j = 0; j < words.length; j++) {
            String element = words[j];//"Java"
            int frequency = 0;
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(element)) {
                    frequency++;
                }

            }
            if (frequency == 1) {
                System.out.println(element);


            }
        }
    }
}
