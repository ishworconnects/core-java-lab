
public class HouseWork {
    public static void main(String[] args) {

        //creating Object:  Classname objectName = new Classname(): Scanner sc= newScanner concept
        House h1 = new House();
        h1.name= "My House";
        h1.color = "Red";
        h1.price = 2000000;

        House h2 = new House();
        h2.name= "Sathiko Ghar";
        h2.color = "Blue";
        h2.price = 5000000;

        h1.printInfo();
        h2.printInfo();
        h2.displayColor();
    }
}





//Creating Class

class House{
    String name;
    String color;
    double price;

    void printInfo(){
        System.out.println("House name : " + this.name);
        System.out.println("House color is: "+this.color);
        System.out.println("House price is: "+this.price);
        System.out.println("\n");
    }

    void displayColor(){
        System.out.println("House color is: "+this.color);



    }

}

