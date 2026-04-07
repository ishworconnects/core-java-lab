public class AbstractionWork {
    public static void main(String[] args) {
        HarryPotter hp = new HarryPotter();
        hp.bookPages();
        hp.printBookDetails();

        JayBholi jb = new JayBholi();
        jb.bookPages();
        jb.printBookDetails();


    }
}
abstract class Book {
    public abstract void bookPages();

    public void printBookDetails(){
        System.out.println("Book Details:");
    }
}
class HarryPotter extends Book {
    public void bookPages(){
        System.out.println("100 Pages:");
    }
}
class JayBholi extends Book {
    public void bookPages(){
        System.out.println("200 Pages:");
    }
}
