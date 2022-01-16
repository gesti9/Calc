import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
        Map<String firstName, String iin> person = HashMap<String, String>();
        person.put("Sultan", "970527354811");
        System.out.println(person.get("Sultan"));
    }
}
