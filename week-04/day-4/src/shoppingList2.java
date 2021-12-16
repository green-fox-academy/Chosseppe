import java.util.HashMap;

public class shoppingList2 {
    public static void main(String[] args) {

        HashMap<String, Double> productsPrices = new HashMap<>();
        productsPrices.put("Milk", 1.07);
        productsPrices.put("Rice", 1.59);
        productsPrices.put("Eggs", 3.14);
        productsPrices.put("Cheese", 12.60);
        productsPrices.put("Chicken Breasts", 9.40);
        productsPrices.put("Apples", 2.31);
        productsPrices.put("Tomato", 2.58);
        productsPrices.put("Potato", 1.75);
        productsPrices.put("Onion", 1.10);

        HashMap<String, Integer> BobsShoppingList = new HashMap<>();
        BobsShoppingList.put("Milk", 3);
        BobsShoppingList.put("Rice", 2);
        BobsShoppingList.put("Eggs", 2);
        BobsShoppingList.put("Cheese", 1);
        BobsShoppingList.put("Chicken Breasts", 4);
        BobsShoppingList.put("Apples", 1);
        BobsShoppingList.put("Tomato", 2);
        BobsShoppingList.put("Potato", 1);

        HashMap<String, Integer> AlicesShoppingList = new HashMap<>();
        AlicesShoppingList.put("Rice", 1);
        AlicesShoppingList.put("Eggs", 5);
        AlicesShoppingList.put("Chicken Breasts", 2);
        AlicesShoppingList.put("Apples", 1);
        AlicesShoppingList.put("Tomato", 10);

        //Create an application which prints out the answers to the following questions:

        //How much does Bob pay?
        System.out.println(howMuchPay(BobsShoppingList, productsPrices));
        //How much does Alice pay?
        System.out.println(howMuchPay(AlicesShoppingList, productsPrices));
        //Who buys more Rice?
        System.out.println(whoBuysMore(BobsShoppingList, AlicesShoppingList, "Rice"));
        //Who buys more Potato?
        System.out.println(whoBuysMore(BobsShoppingList, AlicesShoppingList, "Potato"));
        //Who buys more Ham?
        System.out.println(whoBuysMore(BobsShoppingList, AlicesShoppingList, "Ham"));
        //Who buys more Apples?
        System.out.println(whoBuysMore(BobsShoppingList, AlicesShoppingList, "Apples"));
        //Who buys more of different products?
        //Who buys more items? (more pieces)

    }

    private static double howMuchPay(HashMap compared, HashMap comparedTo){
        int numberOfPieces;
        double pricePerPiece;
        double sumOfPrices = 0;

        for(Object key: compared.keySet()){
            if(compared.containsKey(key)){
                numberOfPieces = (int) compared.get(key);
                pricePerPiece = (Double) comparedTo.get(key);
                sumOfPrices += numberOfPieces * pricePerPiece;
            }
        }
        return sumOfPrices;
    }

    private static String whoBuysMore(HashMap comparedBob, HashMap compared2Alice, String product){
        int comparedProduct;
        int comparedProduct2;

        if(comparedBob.get(product) == null) {
            comparedProduct = 0;
        }else{
            comparedProduct = (int) comparedBob.get(product);
        }

        if(compared2Alice.get(product) == null){
            comparedProduct2 = 0;
        }else{
            comparedProduct2 = (int) compared2Alice.get(product);
        }

        if(comparedProduct == comparedProduct2){
            return "No one";
        }else if(comparedProduct < comparedProduct2) {
            return "Alice";
        }else{
            return "Bob";
        }

        
    }
}
