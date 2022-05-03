import java.util.*;

public class SolarSystem{
    public static void main(String... args){
        List<String> planetList = Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune");

        // "Saturn" is missing from the planetList
        // Insert it into the correct position
        // Create a method called "putSaturn()" which has a list parameter and returns
        // the list of planets in the correct order

        // Expected output: [Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune]
        System.out.println(putSaturn(planetList));
        //System.out.println(putSaturn(planetList));

    }

    private static List<String> putSaturn(List<String> inputList){
        List<String> outputList = new ArrayList<>();
        for(int i = 0; i < inputList.size(); i++)
            if( i == 5) {
                if(!inputList.get(i).equals("Saturn")) {
                    outputList.add("Saturn");
                }
                outputList.add(inputList.get(i));

            }else{
                outputList.add(inputList.get(i));
            }
        return outputList;
    }
}