enum Gender{Male, Female, Other}

public class EnumWork {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.gender=Gender.Male;
        h1.name ="Ishwor";

        Human h2 = new Human();
        h2.gender=Gender.Female;
        h2.name ="Manjita";

        System.out.println(h1.gender);
        System.out.println(h1.name);
        System.out.println("........\n");
        System.out.println(h2.gender);
        System.out.println(h2.name);

    }

}
class Human{
    String name;
    Gender gender;


}
