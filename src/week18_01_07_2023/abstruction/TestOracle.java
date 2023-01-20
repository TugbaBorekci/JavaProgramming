package week18_01_07_2023.abstruction;

public class TestOracle {
    public static void main(String[] args) {
        OracleDatabase oracleDatabase = new OracleDatabase();
        oracleDatabase.save("Adam");
        System.out.println(oracleDatabase.names);

        oracleDatabase.save("Tugba");
        System.out.println(oracleDatabase.names);

        oracleDatabase.delete("Adam");
        System.out.println(oracleDatabase.names);

        oracleDatabase.update("Tugba", "Elif");
        System.out.println(oracleDatabase.names);
    }
}
