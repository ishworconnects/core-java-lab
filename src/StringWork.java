import java.sql.SQLOutput;

public class StringWork {
   public static void main(String[] args) {
       String country = "Nepal";
       String capital = "Kathmandu, ";
       String tempValue ="India";

       System.out.println("The Length of country is: "+ country.length());
       System.out.println("The Length of capital is: "+ capital.length());

       System.out.println(country.charAt(2));

       System.out.println("Address is "+country +" "+capital); //Concat//
       System.out.println("Address is " +capital.concat(country));
       System.out.println("Is country eequal to temp value: "+country.equals(tempValue));

       String value = "Hello I am from Dumre. Dumre is small town of Tanahun, Nepal." ;

      // System.out.println(value.replace(" Dumre", "Narayangadh"));
       String newValue = value.replace("Dumre","Damauli");
       System.out.println(newValue);

       //Alternative way
       System.out.println(country.substring(1,3));
       System.out.println(country.toUpperCase());
       System.out.println(country.toLowerCase());






    }
}
