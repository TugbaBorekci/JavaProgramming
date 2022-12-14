package day31_Constructors.TaskConstructor;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String owner;
    public String location;
    public int numberOfStars;
    public ArrayList<Server> servers = new ArrayList<>();
    public ArrayList<Chef> chefs = new ArrayList<Chef>();


    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }

    public void hireServer(Server server) {
        servers.add(server);
    }
    public void hireServer(Server[] servers1){
        servers.addAll(Arrays.asList(servers1));
    }
    public void hireChef(Chef chef){
        chefs.add(chef);
    }

    public void hireChef(Chef[] chefs1){
        chefs.addAll(Arrays.asList(chefs1));
    }
    public void terminateChef(int employeeId){
    chefs.removeIf(p -> p.employeeId==employeeId);
    }
    public  void terminateServer(int employeeId){
        servers.removeIf(p -> p.employeeId==employeeId);
    }


    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", servers=" + servers +
                ", chefs=" + chefs +
                '}';
    }

    public static void main(String[] args) {

       Restaurant restaurant1 = new Restaurant("Aysegul","Oxford",5);
        System.out.println(restaurant1);
    }
}