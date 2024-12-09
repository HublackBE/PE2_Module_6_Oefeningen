import java.util.HashSet;

public class Werknemer {
    String naam;
    HashSet<String> skills = new HashSet<>();

    public Werknemer(String naam) {
        this.naam = naam;
    }

    public boolean add(String vak){
        return this.skills.add(vak);
    }
    public boolean remove(String vak){
        return this.skills.remove(vak);
    }

}
