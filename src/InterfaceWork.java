public class InterfaceWork {
    public static void main(String[] args) {
        Car c=new Car();
        Bike b=new Bike();
        c.run();
        b.run();
    }
}


interface Vehicle{
    void run();
}
class Car implements Vehicle{
   public void run(){
        System.out.println("Car running");
    }
}
class Bike implements Vehicle {
    public void run() {
        System.out.println("Bike running");

        System.out.println("Bike runs with 2 wheels");
    }
}


