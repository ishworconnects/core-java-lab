import java.util.Collections;
import java.util.LinkedList;

public class LinkedListWork {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Tanisha Thapa");
        names.add("Mamita Shrestha");
        names.add("Shradha Shrestha");
        names.add("Anar Singh Basnet");

        // sort names
        Collections.sort(names);

        // to print details
        for(String name: names){
            System.out.println(name);
        }

    }
}