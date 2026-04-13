public class ParameterAndNoReturnType {
    public static void main(String[] args) {
        add(25,28);
        printAge(1991);
    }

    public static void add(int n1, int n2) {
        int sum = n1 + n2;
        System.out.println("The sum is = " + sum);
    }

    public static void printAge(int birthYear) {
        int age = 2026 - birthYear;
        System.out.println("The age is = " + age);
    }
}

