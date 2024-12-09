public class Main {
    public static void main(String[] args) {
        Werknemer john = new Werknemer("John");
        System.out.println(john.add("Data"));
        System.out.println(john.skills);
        System.out.println(john.add("Data"));
        System.out.println(john.skills);
        System.out.println(john.remove("Data"));
        System.out.println(john.skills);
        System.out.println(john.remove("Data"));
        System.out.println(john.skills);
    }
}
