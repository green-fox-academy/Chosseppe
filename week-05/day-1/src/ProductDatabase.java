import java.util.HashMap;
import java.util.Map;

public class ProductDatabase {

    public static void main(String[] args) {

        Map<String, Integer> products = new HashMap<>();
        products.put("Eggs", 200);
        products.put("Milk", 200);
        products.put("Fish", 400);
        products.put("Apples", 150);
        products.put("Bread", 50);
        products.put("Chicken", 550);

        fishPrice(products, "Fish");
    }

    private static void fishPrice(Map<String, Integer> inputMap, String searchedProduct){
        for(Object key: inputMap.keySet()){
            if((String) key == searchedProduct){
                System.out.println(inputMap.get(key));
            }
        }
    }

    private static void mostExpensive(Map<String, Integer> inputMap){
        int searchingMostExpensive;
    }
}
