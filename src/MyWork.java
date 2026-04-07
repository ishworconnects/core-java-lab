public class MyWork {
    public static void main(String[] args) {

        Box.info = "Helo";
        Box.info = " Hii";

        System.out.println(Box.info);
        System.out.println(Database.getInfo());
    }
}
class Box{
    static String info;
}
class Database{
    static String getInfo(){
        return "localhost";
    }
}
