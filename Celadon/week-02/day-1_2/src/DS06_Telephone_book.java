import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DS06_Telephone_book {
    public static void main(String[] args) {

        /*
        We are going to represent our contacts in a map where both the keys and values are strings.
        Create a map with the following key-value pairs:
         */
        Map<String, String> phone_book = new HashMap<>();
        phone_book.put("William A. Lathan", "405-709-1865");
        phone_book.put("John K. Miller", "402-247-8568");
        phone_book.put("Hortensia E. Foster", "606-481-6467");
        phone_book.put("Amanda D. Newland", "319-243-5613");
        phone_book.put("Brooke P. Askew", "307-687-2982");

        System.out.println(phone_book.get("John K. Miller"));

        for(Map.Entry<String, String> entry: phone_book.entrySet()) {
            if(Objects.equals(entry.getValue(), "307-687-2982")) {
                System.out.println(entry.getKey());
            }
        }
        if(phone_book.containsKey("Chris E. Myers") == false){
            System.out.println("no");
        }else{
            System.out.println("yes");
        }

    }
}
