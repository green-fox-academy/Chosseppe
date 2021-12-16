package countLetters;

import java.util.HashMap;
import java.util.Map;

public class CountLetters {

    public static Map<Character, Integer> dictionary(String inputString){
        Map<Character, Integer> dictionary = new HashMap<>();
        char[] inputChars = inputString.toCharArray();
        for(char character: inputChars){
            if(!dictionary.containsKey(character)){
                dictionary.put(character, 1);
            }else{
                dictionary.put(character, dictionary.get(character) + 1);
            }
        }
    return dictionary;
    }
}
