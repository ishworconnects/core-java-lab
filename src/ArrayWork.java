public class ArrayWork {
    public static void main(String[] args) {
       // String name = "Ishwor";
        String[] names = { "Amesbury", "Ishwor", "Hari", "Gopal", "Manjita", "Nirmala" };

        // Index starts with 0
        // Length starts with 1
        System.out.println("Total Names " + names.length);

        // Change Hari to Debu
        names[2] = "Debu";

        // using loop now
        // for(int i=0;i<names.length;i++){
        //     System.out.println(names[i]);
        // }

        // Enhanced for loop
        for (String name : names) {
            System.out.println(name);
        }
    }
}