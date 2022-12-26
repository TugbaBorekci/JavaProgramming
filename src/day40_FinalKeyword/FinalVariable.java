package day40_FinalKeyword;

public class FinalVariable {

    final String birthDay;//instance variable i bu sekilde yazarsak hata veriyo. Ama constructor eklersek hata vermiyor
    final static String name;//(final keyword ile static kullanamiyoruz hata veriyor. Hata vermemesi icin static block hazirlayip assign yapabiliriz
    static {
        name = "Batch 25";
    }
    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    public final static void main(String[] args) {//final keyword u kullanirsak we can not overridden

        final double pi = 3.14;//final keyword kullanildigi icin sadece bir defa assign yapiyor tekrar tekrar reassign yapmaz

        //pi = 4.14; if we use final variables can not be reassigned
        //pi = 5.4;

        final String name;//sadece bir defa assign yapabiliyorsun java ismini verdikten sonra reassign yapamazsin tekrardan
        name = "Java";
      //name = "Wodden Spoon";
        System.out.println(name);

        System.out.println("--------------------------------------------------------");

        FinalVariable obj = new FinalVariable("May/01");
      //obj.birthDay = "June/01";//final variables kullanildigi icin tekrar assign yapmak istedigimizde hata veriyor
        System.out.println(obj.birthDay);

        System.out.println("--------------------------------------------------------");

        System.out.println(name);//Java yazdirir
       // FinalVariable.name="Paython"; yazip assign yapmak istersek hata verir.cunku final keyword kullanilmistir.reassign yapilamaz
        System.out.println(FinalVariable.name);//Batch 25 yazdirir class name ile yazdirinca(FinalVariable.name)

    }
}
