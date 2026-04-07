import java.io.FileWriter;

public class FileWriterWork {
    public static void main(String[] args){
        try{
            FileWriter fw = new FileWriter("hello.txt");//use append to add text without deletion
            fw.write("I am writing content to File");
            fw.close();
            System.out.println("File writing successful");
        }
        catch(Exception ex){
            System.out.println("File writing failed");
        }
    }

}
