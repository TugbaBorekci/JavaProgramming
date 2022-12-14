package day31_Constructors.TaskConstructor;

public class Item {

    public String name;
    public double unitPrice;
    public int quantity;

    public Item(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;

    }

    public double calcCost(){
        double total = unitPrice*quantity;
        return total;
    }


    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ",total=" + calcCost()+
                '}';
    }

    public static void main(String[] args) {
        Item item1 = new Item("glass",200,2);
        System.out.println(item1);
    }

}
