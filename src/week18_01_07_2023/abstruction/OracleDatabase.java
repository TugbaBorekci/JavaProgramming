package week18_01_07_2023.abstruction;

public class OracleDatabase extends Database {

    @Override
    void save(String name) {
        System.out.println("I will add " + name + " inside the database");
        names.add(name);
    }

    @Override
    void delete(String name) {
        System.out.println("I will delete " + name + " from database ");
    names.remove(name);
    }

    @Override
    void update(String oldName, String newName) {
        names.remove(oldName);
        names.add(newName);

    }
}
