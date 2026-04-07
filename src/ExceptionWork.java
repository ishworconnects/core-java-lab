import java.util.Scanner;

public class ExceptionWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

            System.out.println("Enter first Number : ");
            int n1 = sc.nextInt();
            System.out.println("Enter second Number : ");
            int n2 = sc.nextInt();

            int sum = n1 + n2;
            System.out.println("Sum is : " + sum);

        } catch (Exception ex) {
            System.out.println("Please enter a number only");
        }finally{
            System.out.println("At last");
        }
    }
}
