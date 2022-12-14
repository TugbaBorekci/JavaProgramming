package day28_ArrayList;

import java.util.ArrayList;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");//0
        list.add("Java");//1
        list.add("Java");//2
        list.add("Python");//3
        list.add("C#");//4
        list.add("C#");//5
        list.add("C#");//6
        list.add("Ruby");//7
        list.add("C++");//8
        list.add("C++");//9

        System.out.println(list);//[Java, Java, Java, Python, C#, C#, C#, Ruby, C++, C++]


        ArrayList<String> unique = new ArrayList<>();// another array list name uniqe

        //foreach loop kullanarak baslaticagiz.index number ve last index number birbirine esit ise yani bir kere yazildiysa unique element olarak yazdiricak
        for (String each : list) { //data structure String oldugu icin String yaziyoruz : list name i yaziyoruz each element of the array list
            if (list.indexOf(each) == list.lastIndexOf(each)) {//that is uniqe method. first index matching elements array list
                //then last index matching in the array list
                unique.add(each);
            }

        }
        System.out.println(unique);
    }
}
