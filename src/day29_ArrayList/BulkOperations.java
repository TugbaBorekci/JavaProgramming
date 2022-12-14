package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;


public class BulkOperations {
    public static void main(String[] args) {


        //addAll method:eklemek istedigimiz elementleri bu kodu kullanarak yapiyoruz... list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,3,3,3,3,5,5,5,5,8,8,8));
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 3, 3, 3, 3, 5, 5, 5, 5, 8, 8, 8));
        System.out.println(list);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 3, 3, 3, 3, 5, 5, 5, 5, 8, 8, 8]

        System.out.println("------------------------------------------------------------------------");

        //removeAll method:arrayListeki verilerden istemediklerimizi cikarmak icin bu kodu kullaniyoruz...list.removeAll(Arrays.asList(3,5,8));
        list.removeAll(Arrays.asList(3, 5, 8));//array listteki bu rakamlari bularak cikaricak listeden
        System.out.println(list);//[1, 2, 4, 6, 7, 9, 10]

        System.out.println("------------------------------------------------------------------------");

        //retainAll method:opposite of remove metot...numbers.retainAll(Arrays.asList(100, 200, 300)); bu kodu kullanarak tutmak istedigin numaralari verileri giriyorsun.
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100, 200, 300, 400, 500, 600, 700, 100, 200, 300, 800, 900));
        numbers.retainAll(Arrays.asList(100, 200, 300));
        System.out.println(numbers);//[100, 200, 300, 100, 200, 300]

        System.out.println("------------------------------------------------------------------------");

        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA", "SDET", "Developer", "QA", "SDET", "Scrum master", "BA", "Ba"));
        System.out.println(jobTitles);//[QA, SDET, Developer, QA, SDET, Scrum master, BA, Ba]

        jobTitles.retainAll(Arrays.asList("QA", "SDET"));
        System.out.println(jobTitles);//[QA, SDET, QA, SDET]

        System.out.println("------------------------------------------------------------------------");

        //contains tek tek numaralar giriliyor.eger girilen numara array listte varsa tru yazdiririyor.yoksa false
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 8, 9, 10));
        boolean r1 = nums.contains(10);
        System.out.println("r1 = " + r1);//true

        boolean r2 = nums.contains(2) && nums.contains(5) && nums.contains(10);
        System.out.println("r2 = " + r2);//true

        //containsAll birkac numara birden girebilirsin ama bir tanesi bile olmazsa false sonucunu verir
        boolean r3 = nums.containsAll(Arrays.asList(2, 5, 10, 1000));
        System.out.println("r3 = " + r3);//false.eger sayilardan bir tanesi bile yoksa false sonucunu verir

        System.out.println("------------------------------------------------------------------------");
        //convert non-primitive arrays to the arrayList
        String[] names = {"Josh", "Jack", "Daniel", "Shay", "Breanna"};

        //first way
        /*
        ArrayList<String> namesList = new ArrayList<>();
        namesList.addAll(Arrays.asList(names));
         */

        //second way
        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));
        System.out.println(namesList);

        System.out.println("------------------------------------------------------------------------");

        //convert primitive array to the arrayList bu metotla yapilamaz compile error veriyor.
      /*
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> list2 =new ArrayList<>(Arrays.asList(arr))
       */

        System.out.println("------------------------------------------------------------------------");
        //convert primitive array to the arrayList Integer[] arr yaparak olur boyle yapinca non-primtive oluyor ve convert yapilabiliyor
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list2);

        System.out.println("------------------------------------------------------------------------");

    //costom method()ile istedigimiz primitive array i non primitive array e convert yapabiliyoruz
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList<Integer> list3 = new ArrayList<>(convertArrayToArrayList(arr2));
        System.out.println("list3 = " + list3);//list3 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    }

    //custom method() kullanarak int array returns ArrayList
    public static ArrayList<Integer> convertArrayToArrayList(int[] array){
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);
        }
        return list;

        }


    }





