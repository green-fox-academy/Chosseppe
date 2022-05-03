import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Fox {

    String name;
    String color;
    Integer age;

    public Fox(String inputName, String inputColor, Integer inputAge){
        this.name = inputName;
        this.age = inputAge;
        this.color = inputColor;
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {

        List<Fox> foxes = new ArrayList<>();
        foxes.add(new Fox("Ranger","Green", 2));
        foxes.add(new Fox("Ariana", "Green", 6));
        foxes.add(new Fox("Coco","Brown", 4));
        foxes.add(new Fox("Frankie","Red", 7));
        foxes.add(new Fox("Oreo","Yellow", 3));
        foxes.add(new Fox("Dora","Gray", 5));
        foxes.add(new Fox("Chance","Brown", 8));
        foxes.add(new Fox("Luke","Yellow", 1));

        for(Fox fox :greenFoxes(foxes)){
            System.out.println(fox.age + " " + fox.color + " " + fox.name);
        }

        for(Fox fox :youngGreenFoxes(foxes)){
            System.out.println(fox.age + " " + fox.color + " " + fox.name);
        }

        System.out.println(foxesColor(foxes));

    }

    private static List<Fox> greenFoxes(List<Fox> inputList){
        List<Fox> outputList = new ArrayList<>();
        inputList.stream()
                .filter(fox -> fox.color.equals("Green"))
                .forEach(outputList::add)
        ;

        return outputList;
    }

    private static List<Fox> youngGreenFoxes(List<Fox> inputList){
        List<Fox> outputList = new ArrayList<>();
        inputList.stream()
                .filter(fox -> fox.color.equals("Green"))
                .filter(fox -> fox.age < 5)
                .forEach(outputList::add)
        ;

        return outputList;
    }

    private static Map<String, Integer> foxesColor(List<Fox> inputList){

        return inputList.stream()
                .map(Fox::getColor)
                .collect(Collectors.toMap(
                        k -> k,
                        v -> 1,
                        Integer::sum));
    }
}
