import java.io.File;

public class Make100File {
    public static void main(String[] args) {
        for (int i = 0; i <=100; i++) {
            createFile("hello" + i + ".txt");
        }
    }

    public static void createFile(String fileName) {
        try {
            File f = new File(fileName);
            if (f.createNewFile()) {
                System.out.println("File is created");
            } else {
                System.out.println("File already exists");
            }
        } catch (Exception ex) {  // ✅ catch now correctly closes the try block
            System.out.println("Something went wrong");
        }
    }
}