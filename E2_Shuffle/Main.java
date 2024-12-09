import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> studenten = new ArrayList<>();

        studenten.add("John");
        studenten.add("Jill");
        studenten.add("Tiberius");
        studenten.add("Bill");
        studenten.add("Luke");
        studenten.add("Kirk");
        studenten.add("Jeanny");

        System.out.println(studenten);

        Collections.shuffle(studenten);

        System.out.println(studenten);
    }
}
