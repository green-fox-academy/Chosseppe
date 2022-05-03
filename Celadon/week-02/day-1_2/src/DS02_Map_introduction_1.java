import java.util.HashMap;
import java.util.Map;

public class DS02_Map_introduction_1 {
    public static void main(String[] args) {
        //Create an empty map where the keys are integers and the values are characters
        Map<Integer,String> dictionary = new HashMap();
        //Print out whether the map is empty or not
        System.out.println(dictionary.size() == 0);
        //Adding the key-value pairs to the map
        dictionary.put(97,"a");
        dictionary.put(98,"b");
        dictionary.put(99,"c");
        dictionary.put(65,"A");
        dictionary.put(66,"B");
        dictionary.put(67,"C");
        //Print all the keys
        System.out.println(dictionary.keySet());
        //Print all the values
        System.out.println(dictionary.values());
        dictionary.put(68,"D");
        //Print how many key-value pairs are in the map
        System.out.println(dictionary.size());
        //Print the value that is associated with key 99
        System.out.println(dictionary.get(99));
        //Remove the key-value pair where with key 97
        dictionary.remove(97);
        //Print whether there is an associated value with key 100 or not
        System.out.println(dictionary.containsKey(100));
        //Remove all the key-value pairs
        dictionary.clear();
        //Print how many key-value pairs are in the map
        System.out.println(dictionary.size());

    }
}
