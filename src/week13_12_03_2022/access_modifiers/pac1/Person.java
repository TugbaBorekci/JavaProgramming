package week13_12_03_2022.access_modifiers.pac1;

public class Person {

    public String name;//eger public se heryerden buna ulasabiliriz demek outside the baska packagelardanda
    String lastName;//this is default(public,privete yada protected degil)  we can use just this package baska package larda kullanamiyiz
    private int id;//private sadece ve sadece kendi classinda kullanabiliriz baska yerde kullaamayiz(ayni package da bile kullanamayiz)
    static protected int age;//static yapmazsak diger package ve classlarda kullanamayiz sadece subclass yani kendi clasinda kullanabiliriz.static yazarsak basina package icinde kullanabiliriz

    public void getId(){
        System.out.println(id);
    }
}
