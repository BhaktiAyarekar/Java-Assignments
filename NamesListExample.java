import java.util.ArrayList;
public class NamesListExample {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Sam");
        names.add("Alice");
        names.add("Steve");
        names.add("Bob");
        names.add("Sonia");

        for (String name : names) {
            if (name.startsWith("S")) {
                System.out.println(name);
            }
        }
    }
}
