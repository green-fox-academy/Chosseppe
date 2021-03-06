import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DS03_List_introduction_2 {
    public static void main(String[] args) {

        //Create a list ('List A') which contains the specific values
        List<String> List_A= new ArrayList<>();
        List_A.add("Apple");
        List_A.add("Avocado");
        List_A.add("Blueberries");
        List_A.add("Durian");
        List_A.add("Lychee");

        //Create a new list ('List B') with the values of List A
        List<String> List_B= new ArrayList<>(List_A);
        //Print out whether List A contains "Durian" or not
        System.out.println(List_A.contains("Durian"));
        //Remove "Durian" from List B
        List_B.remove("Durian");
        //Add "Kiwifruit" to List A after the 4th element
        List_A.add(4, "Kiwifruit");
        //Compare the size of List A and List B
        System.out.println(List_A.size() == List_B.size());
        //Get the index of "Avocado" from List A
        System.out.println(List_A.indexOf("Avocado"));
        //Get the index of "Durian" from List B
        System.out.println(List_B.indexOf("Durian"));
        //Add "Passion Fruit" and "Pomelo" to List B in a single statement
        List_B.addAll(Arrays.asList("Passion Fruit", "Pomelo"));
        //Print out the 3rd element from List A
        System.out.println(List_A.get(2));
        //Print all elements of List A
        System.out.println(List_A);
        //Print all elements of List B
        System.out.println(List_B);

    }
}
