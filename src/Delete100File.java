
import java.io.File;

public class Delete100File {

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            deleteFile("hello" + i + ".txt");
        }
    }

    public static void deleteFile(String fileName) {
        try {
            File f = new File(fileName);
            if (f.delete()) {
                System.out.println("File is deleted");
            } else {
                System.out.println("File is not available");
            }
        } catch (Exception ex) {
            System.out.println("Something went wrong");
        }
    }
}