import java.util.Arrays;
import java.util.LinkedHashSet;

// kniznice su nastroje na ulahcenie prace
//LinkedHashSet je najlepsi na odstranovanie duplikatov z kolekcie array(listov)
//pouziva sa na vymazanie duplikovanych elementov z kodu a udrzbu postupnosti elementov

public class F08_Unique {
    public static void main(String[] args) {
        //  Create a function that takes an array of numbers as a parameter
        //  and returns an array of integers where every integer is unique (occurs only once)

        //  Example
        System.out.println(Arrays.toString(findUniqueItems(new Integer[] {1, 11, 34, 11, 52, 61, 1, 34})));
        //  should print: `[1, 11, 34, 52, 61]`
    }

    private static Integer[] findUniqueItems(Integer[] z){

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(z));

        return linkedHashSet.toArray(new Integer[]{});

    }

}
