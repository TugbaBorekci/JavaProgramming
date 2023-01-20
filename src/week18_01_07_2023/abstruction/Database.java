package week18_01_07_2023.abstruction;

import java.util.ArrayList;

public abstract class Database {
    /*
    -We can have constructor inside the abstract class
    -in orde to initialize the common elements or variables in abstruct class
    -we are putting rule for the constructor
    */
    /*
    public Database(String name){
    }
     */

    protected ArrayList<String> names = new ArrayList<>();
    //Rules for database
    //1.rule
    abstract void save(String name);

    //2.rule
    abstract void delete(String name);

    //3.rule
    abstract void update(String oldName,String newName);



}
