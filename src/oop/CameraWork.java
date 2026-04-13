public class CameraWork {
    public static void main(String[] args) {
        Camera c1 = new Camera(1,"Sony");
        Camera c2 = new Camera(2,"Canon");

        c1.printDetails();
        c2.printDetails();


    }
}
class Camera{
    int id;
    String name;

    Camera(int id, String name){
        this.id = id;
        this.name = name;
    }

    void printDetails(){
        System.out.println("Name is: "+name);
        System.out.println("ID is: "+id);

        System.out.println(".........\n");
    }
}
