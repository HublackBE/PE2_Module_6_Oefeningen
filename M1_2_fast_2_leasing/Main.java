import java.util.TreeMap;

public class Main{
    public static TreeMap< String, Wagen > nummerplaten = new TreeMap<>();

    public static void main(String[] args) {
        Wagen test = new Wagen("1234","Diesel", 5);
        Wagen test2 = new Wagen("51651", "LPG", 2);
        nummerplaten.put("AEB-156", test);
        nummerplaten.put("AAA-111", test2);
        System.out.println(nummerplaten);
        System.out.println(test.rent());
        System.out.println(test.free());
        System.out.println(test.free());
        System.out.println(search("AEB-156"));
        System.out.println(test.rent());
    }

    public static Wagen search(String nummerplaat) {
        return nummerplaten.get(nummerplaat);
    }
}
