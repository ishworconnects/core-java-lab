public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
//static block is processed first and then main class is run later on //
    static {
        System.out.println("Static Block2");
    }
    static  {
        System.out.println("Static Block1");
    }
}

