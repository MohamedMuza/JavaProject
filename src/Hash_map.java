import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hash_map {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<String, String>();
        phoneBook.put("Jana", "94363846384");
        phoneBook.put("Varun", "8888888888");
        phoneBook.put("Adil", "8578968079");
        phoneBook.put("umer", "9343985377");

        //printing the phonebook
        System.out.println("Iterating Hashmap...");
        Set<String> keys = phoneBook.keySet();
        for(String i : keys)
        {
            System.out.println(i + " : " + phoneBook.get(i));
        }
        }
    }

