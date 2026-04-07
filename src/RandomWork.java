public class RandomWork {
    public static void main(String[] args) {
        generateRandomNumber(500);
    }

    public static void generateRandomNumber(int n){
        int random = (int)(Math.random() * n) + 1;
        System.out.println("The Random Number is " + random);
    }
}