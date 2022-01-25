import java.util.Map;
import java.util.HashMap;

public class DS04_Map_introduction_2 {
    public static void main(String[] args) {

        /*
        Create a map where the keys are strings and the values are strings
        with the specified initial values
         */
        Map<String, String> phone_contacts = new HashMap<>();
        phone_contacts.put("978-1-60309-452-8", "A Letter to Jo");
        phone_contacts.put("978-1-60309-459-7", "Lupus");
        phone_contacts.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        phone_contacts.put("978-1-60309-461-0", "The Lab");
        //Print all the key-value pairs in the specified format
        for(Object key: phone_contacts.keySet()){
            System.out.println(phone_contacts.get(key) + " (ISBN: " + key + ")");
        }
        //Remove the key-value pair with key 978-1-60309-444-3
        phone_contacts.remove("978-1-60309-444-3");
        //Remove the key-value pair with value The Lab
        for(Object key: phone_contacts.keySet()){
            if(phone_contacts.get(key)== "The Lab"){
                phone_contacts.remove(key);
            }
        }
        //Add the following key-value pairs to the map
        phone_contacts.put("978-1-60309-450-4", "They Called Us Enemy");
        phone_contacts.put("978-1-60309-453-5", "Why Did We Trust Him?");
        //Print whether there is an associated value with key 478-0-61159-424-8 or not
        System.out.println(phone_contacts.containsKey("478-0-61159-424-8"));
        //Print the value associated with key 978-1-60309-453-5
        System.out.println(phone_contacts.get("978-1-60309-453-5"));

    }
}
