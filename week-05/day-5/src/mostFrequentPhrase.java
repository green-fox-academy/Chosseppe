import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class mostFrequentPhrase {

    public static void main(String[] args) {

        String text = """
                But then they were married (she felt awful about being pregnant before but
                Harry had been talking about marriage for a while and anyway laughed when
                she told him in early February about missing her period and said Great she
                was terribly frightened and he said Great and lifted her put his arms around
                under her bottom and lifted her like you would a child he could be so
                wonderful when you didn't expect it in a way it seemed important that you
                didn't expect it there was so much nice in him she couldn't explain to
                anybody she had been so frightened about being pregnant and he made her
                be proud) they were married after her missing her second period in March
                and she was still little clumsy dark-complected Janice Springer and her
                husband was a conceited lunk who wasn't good for anything in the world Daddy
                said and the feeling of being alone would melt a little with a little drink.""";

        String specialSigns = "a (a) a, b b c";

        System.out.println(mostFrequent(text));

        System.out.println(mostFrequent(specialSigns));

        /*

        Write a function that receives a sentence as a parameter and returns the most frequent word of that sentence.
        If there is more than one such word return any one of them.
        */

    }

    private static String mostFrequent(String inputString) {
        ArrayList<String> words = new ArrayList<>();
        Map<String, Integer> wordsCounter = new HashMap<>();
        String smallest = null;
        int minimum = 0;

        for (String word : inputString.split(" ")) {
            word = word.toLowerCase();

            if (!word.startsWith("a") && !word.startsWith("b") && !word.startsWith("c") && !word.startsWith("d")
                    && !word.startsWith("e") && !word.startsWith("f") && !word.startsWith("g") && !word.startsWith("h")
                    && !word.startsWith("i") && !word.startsWith("j") && !word.startsWith("k") && !word.startsWith("l")
                    && !word.startsWith("m") && !word.startsWith("n") && !word.startsWith("o") && !word.startsWith("p")
                    && !word.startsWith("q") && !word.startsWith("r") && !word.startsWith("s") && !word.startsWith("t")
                    && !word.startsWith("u") && !word.startsWith("v") && !word.startsWith("w") && !word.startsWith("x")
                    && !word.startsWith("y") && !word.startsWith("z")) {
                StringBuilder newWord = new StringBuilder(word);
                newWord.deleteCharAt(0);
                words.add(newWord.toString());
            } else {
                words.add(word);
            }
        }

        for (String word : words) {
            if (!word.endsWith("a") && !word.endsWith("b") && !word.endsWith("c") && !word.endsWith("d") &&
                    !word.endsWith("e") && !word.endsWith("f") && !word.endsWith("g") && !word.endsWith("h") &&
                    !word.endsWith("i") && !word.endsWith("j") && !word.endsWith("k") && !word.endsWith("l") &&
                    !word.endsWith("m") && !word.endsWith("n") && !word.endsWith("o") && !word.endsWith("p") &&
                    !word.endsWith("q") && !word.endsWith("r") && !word.endsWith("s") && !word.endsWith("t") &&
                    !word.endsWith("u") && !word.endsWith("v") && !word.endsWith("w") && !word.endsWith("x") &&
                    !word.endsWith("y") && !word.endsWith("z")) {

                StringBuilder newWord = new StringBuilder(word);
                newWord.deleteCharAt(newWord.length() - 1);
                words.set(words.indexOf(word), newWord.toString());

            }
        }

        for (String word : words) {
            if (!wordsCounter.containsKey(word)) {
                wordsCounter.put(word, 1);
            } else {
                wordsCounter.put(word, wordsCounter.get(word) +1);
            }
        }

        for(String key: wordsCounter.keySet()) {
            if(wordsCounter.get(key) > minimum){
                minimum = wordsCounter.get(key);
                smallest = key;
            }
        }
        return smallest;
    }

}
