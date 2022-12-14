package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);//[10, 20, 30, 40, 50]

        for (int i = 0; i < list.size(); i++) { // i:index number of list

             list.set(i,  list.get(i) *2);//i is each index separate olarak elementleri degerlendiricek, each index i 2 ile carparak multiply ini buluyoruz
        }
        System.out.println(list);//[20, 40, 60, 80, 100]


    }
}
  /*
      {1,2,3,4,5,6}

      {2,4,6,8,10,12}

         */