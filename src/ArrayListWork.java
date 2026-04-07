import java.util.ArrayList;

public class ArrayListWork {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("John");
        names.add("Jane");
        names.add("Julie");
        names.add("Ishwor");


        names.remove("Jane");
        for(String name : names){
            System.out.println(name);
        }

    }
}
