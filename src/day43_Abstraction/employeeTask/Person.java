package day43_Abstraction.employeeTask;

public abstract class Person {

    //1-once degismeyecek ozelliklerini olusturuyoruz
    private String name;
    private int age;
    private char gender;

   //4-constructor yapiyoruz
    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }
    //5-getter & setter yapiyoruz
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 0){
            throw new RuntimeException("Invalid age: "+age);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

//2-ortak ozellikteki methodlari olusturuyoruz
    public abstract void sleep();//abstract methodu sadece abstruct class da olusturabiliyoruz

//3-ortak ozellikleri olan method olusturuyoruz butun child classlarda kullanabilmek icin
    public void eat(){
        System.out.println(name+" is eating baklava");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

}
