import java.util.*;

public class Candyshop{
    public static void main(String... args){

        ArrayList<Object> list = new ArrayList<Object>();
        list.add("Cupcake");
        list.add(2);
        list.add("Brownie");
        list.add(false);

        // Accidentally we added "2" and "false" to the `list`
        // Your task is to change the "2" to "Croissant" and change the "false" to "Ice cream"
        // No, don't just edit the lines above! :)
        // Create a method called "repairSweetList()" which takes the `list` as a parameter
        // and returns a list with the items "2" and "false" replaced (with "Croissant" and "Ice cream")

        // Expected output: [Cupcake, Croissant, Brownie, Ice cream]
        System.out.println(repairSweetList(list));
    }

    private static ArrayList<Object> repairSweetList(ArrayList<Object> inputList){
        ArrayList<Object> outputList = new ArrayList<>();
        for(Object object : inputList){
            if(object == (Object) 2){
                inputList.add("Croissant");
            }else if(object == (Object) false){
                outputList.add("Ice cream");
            }else{
                outputList.add(object);
            }
        }
        return outputList;
    }
}