import java.util.ArrayList;
import java.util.List;

public class shoppingList {
    public static void main(String[] args) {

        List<String> toBuyList = new ArrayList<>();
        toBuyList.add("eggs");
        toBuyList.add("milk");
        toBuyList.add("fish");
        toBuyList.add("apples");
        toBuyList.add("bread");
        toBuyList.add("chicken");

        isInList(toBuyList, "milk");
        isInList(toBuyList, "banana");

    }

    private static void isInList(List<String> inputList, String searchedItem){
        if(inputList.contains(searchedItem)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
