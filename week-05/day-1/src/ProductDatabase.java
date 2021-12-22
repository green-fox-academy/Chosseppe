import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ProductDatabase {

    public static void main(String[] args) {

        Map<String, Integer> products = new HashMap<>();
        products.put("Eggs", 200);
        products.put("Milk", 200);
        products.put("Fish", 400);
        products.put("Apples", 150);
        products.put("Bread", 50);
        products.put("Chicken", 550);

        System.out.println(fishPrice(products, "Fish"));
        //System.out.println(fishPrice(products, "Banana"));
        System.out.println(mostExpensive(products));
        System.out.println(averagePrice(products));
        System.out.println(priceBelow(products, 300));
        //System.out.println(priceBelow(products, 200));
        System.out.println(priceExactly(products, 125));
        //System.out.println(priceExactly(products, 200));
        System.out.println(cheapestProduct(products));
    }

    private static String fishPrice(Map<String, Integer> inputMap, String searchedProduct){
        String foundKey = null;
        for(String key: inputMap.keySet()){
            if(Objects.equals(key, searchedProduct)){
                foundKey = key;
            }else{
                foundKey = "This product is not in the product list!";
            }
        }
        return foundKey;
    }

    private static String mostExpensive(Map<String, Integer> inputMap){
        int searchingMostExpensive = 0;
        String mostExpensive = null;
        for(String key: inputMap.keySet()){
            if(inputMap.get(key) > searchingMostExpensive){
                searchingMostExpensive = inputMap.get(key);
                mostExpensive = key;
            }
        }
        return mostExpensive;
    }

    private static float averagePrice(Map<String, Integer> inputMap){
        float sumOfPrices = 0;
        for(String key: inputMap.keySet()){
            sumOfPrices += inputMap.get(key);
        }
        return sumOfPrices / inputMap.size();
    }

    private static int priceBelow(Map<String, Integer> inputMap, int number){
        int counter = 0;
        for(String key : inputMap.keySet()){
            if(inputMap.get(key) < number){
                counter += 1;
            }
        }
        return counter;
    }

    private static String priceExactly(Map<String, Integer> inputMap, int number){
        String outputMessage = null;
        for(String key : inputMap.keySet()){
            if(Objects.equals(inputMap.get(key), number)){
                outputMessage = "Yes";
            }else{
                outputMessage = "No";
            }
        }
        return outputMessage;
    }

    private static String cheapestProduct(Map<String, Integer> inputMap){
        String cheapest = null;
        for(String key : inputMap.keySet()){
            if(cheapest == null){
                cheapest = key;
            }else if(inputMap.get(cheapest) > inputMap.get(key)){
                cheapest = key;
            }
        }
        return cheapest;
    }
}
