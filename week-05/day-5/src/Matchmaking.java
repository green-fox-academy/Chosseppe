import java.util.*;

public class Matchmaking{
    public static void main(String... args){

        List<String> girls = new ArrayList<>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        List<String> boys = new ArrayList<>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // If someone has no pair, he/she should be added to the list on his/her own
        // Expected output: [Eve-Joe, Ashley-Fred, Claire-Tom, Kat-Todd, Jane-Neef, Jeff]

        System.out.println(match(girls, boys));
    }

    private static List<String> match(List<String> inputGender, List<String> inputGender2){
        List<String> output = new ArrayList<>();
        if(inputGender.size() == inputGender2.size()){
            for(int i = 0; i < inputGender.size(); i++){
                output.add(inputGender.get(i) + "-" + inputGender2.get(i));
            }
        }else{
            if(inputGender.size() > inputGender2.size()){
                for(int i = 1; i < inputGender.size(); i++){
                    if(inputGender2.contains(inputGender2.get(i - 1))){
                        output.add(inputGender.get(i - 1) + "-" + inputGender2.get(i - 1));
                        if(i == inputGender.size() -1) {
                            output.add(inputGender.get(i));
                        }
                    }
                }
            }else{
                for(int i = 1; i < inputGender2.size(); i++){
                    if(inputGender.contains(inputGender.get(i -1))){
                        output.add(inputGender.get(i-1) + "-" + inputGender2.get(i-1));
                        if(i == inputGender2.size() -1) {
                            output.add(inputGender2.get(i));
                        }
                    }
                }
            }
        }
        return output;
    }
}