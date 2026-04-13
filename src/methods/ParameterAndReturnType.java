public class ParameterAndReturnType {
    public static void main(String[] args) {

        int sum = add(50, 70);
        System.out.println("Sum is " + sum);

        String firstName = "Ishwor";
        String lastName = "Kunwor";
        String fullName = getFullName(firstName, lastName);
        System.out.println(fullName);

        double interest = getSI(50000, 2, 3);
        System.out.println("SI is " + interest);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static String getFullName(String fName, String lName) {
        return "Full name is " + fName + " " + lName;
    }

    public static double getSI(double p, double t, double r) {
        return (p * t * r) / 100;
    }
}

