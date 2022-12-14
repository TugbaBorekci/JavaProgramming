package day31_Constructors.TaskConstructor;

public class Server {

    public String name;
    public int employeeId;
    public double hourlyRate;
    public boolean fullTime;

    public Server(String name, int employeeId, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeId = employeeId;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }
    public void takeOrder(){
        System.out.println(name+"is taking order");
    }
    public void cleanTable(){
        System.out.println(name+"is cleaning table");
    }


    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + fullTime +
                '}';
    }

    public static void main(String[] args) {
        Server server1=new Server("tugba",123,10.5,true);
        Server server2=new Server("havva",124,11.5,false);
        Server server3=new Server("neva",125,12.5,true);

        System.out.println(server1);
        System.out.println(server2);
        System.out.println(server3);
    }
}
