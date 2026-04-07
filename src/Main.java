import Hostel.Sts;

public class Main {
    public static void main(String[] args) {
        Laptop c1 = new Laptop();
        c1.id =1;
        c1.name ="Lenovo";
        c1.price = 800000;
        c1.model ="Thinkpad";

        Laptop c2 = new Laptop();
        c2.id =2;
        c2.name ="Samsung";
        c2.price = 1200000;
        c2.model ="Venture";

        //print details
        c1.displayinfo();
        System.out.println("\n");
        c2.displayinfo();

        Sts s1 = new Sts();


    }
}
