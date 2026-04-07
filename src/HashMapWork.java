import java.util.HashMap;

public class HashMapWork {
    public static void main(String[] args) {
        HashMap<String, String> countryCapital = new HashMap<String,String>();
        countryCapital.put("Nepal","Kathmandu");
        countryCapital.put("India","Delhi");
        countryCapital.put("Finland","Helsinki");
        countryCapital.put("USA","Washington DC");

        System.out.println(countryCapital.get("Nepal"));
        for (String i : countryCapital.keySet()) {
            System.out.println(i);
        }
    }

}
