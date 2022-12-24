package week16_12_24_2022.final_keyword.final_with_variable;

public class TestPerson {

    public static void main(String[] args) {
        Person person=new Person("14-01-1989","ADam");
        System.out.println(person);
        //    person.birthDay="12-01-1989";
        person.setName("Adam");
        System.out.println(person);


    }
}
