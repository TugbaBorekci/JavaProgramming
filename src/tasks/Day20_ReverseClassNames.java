package tasks;

public class Day20_ReverseClassNames {

    public static void main(String[] args) {

        String[] classMates = {"Arzu Kizilari", "Asiye Akpinar", "Abdullah Sagir", "Aysegul Celik", "Serpil Eyuboglu",
                "Ambreen Dad", "Mutullah Demir", "Mustafa Aydin", "Nilay Soni", "Nurdan Kilic"};


        for (int i = 0; i < classMates.length; i++) {
            String name = classMates[i];
            String reverseName = "";

            for (int j = name.length() - 1; j >= 0; j--) {
                reverseName += name.charAt(j);
            }

            System.out.println(reverseName);

        }


    }


}


/*
2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */
