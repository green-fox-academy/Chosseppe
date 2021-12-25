import java.util.HashMap;
import java.util.Map;

public class productDatabase2 {

    public static void main(String[] args) {

        Map<String, Integer> products = new HashMap<>();
        products.put("Eggs", 200);
        products.put("Milk", 200);
        products.put("Fish", 400);
        products.put("Apples", 150);
        products.put("Bread", 50);
        products.put("Chicken", 550);

        lessThan(products, 201);
        //lessThan(products, 200);

        moreThan(products, 150);
    }

    //Create an application which prints out the answers to the following questions:

    //Which products cost less than 201? (just the name)
    private static void lessThan(Map<String, Integer> inputMap, int number){
        for(String key : inputMap.keySet()){
            if(inputMap.get(key) < number){
                System.out.println(key);
            }
        }
    }
    //Which products cost more than 150? (name + price)
    private static void moreThan(Map<String, Integer> inputMap, Integer number){
        for(String key : inputMap.keySet()){
            if(inputMap.get(key) > number){
                System.out.println(key + " " + inputMap.get(key));
            }
        }
    }

}
