import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        evenNumbers();
        squarePositive();
        squareGreater();
        oddNumberAverage();
        oddNumbersCounter();
        uppercaseFromString();
        startWithLetter("R");
        startWithLetter("N");
        concatenatedString();
        frequencyOfCharacters();
    }

    private static void evenNumbers() {

        List<Integer> output = new ArrayList<>();
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        numbers.stream()
                .filter(x -> x % 2 == 0)
                .forEach(output::add)
        ;

        System.out.println(output);
    }

    private static void squarePositive() {

        List<Integer> output = new ArrayList<>();
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        numbers.stream()
                .filter(x -> x > 0)
                .map(x -> x * x)
                .forEach(output::add);

        System.out.println(output);
    }

    private static void squareGreater() {

        List<Integer> output = new ArrayList<>();
        List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);

        numbers.stream()
                .filter(x -> x * x > 20)
                .forEach(output::add);

        System.out.println(output);
    }

    private static void oddNumberAverage() {

        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        double output = (float)
                numbers.stream()
                        .filter(x -> x % 2 != 0)
                        .mapToInt(Integer::intValue)
                        .sum()
                /
                numbers.stream()
                        .filter(x -> x % 2 != 0)
                        .mapToInt(Integer::intValue)
                        .count();
        System.out.println(output);


    }

    private static void oddNumbersCounter() {

        List<Integer> numbers = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
        int output = numbers.stream()
                .filter(x -> x % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(output);
    }

    private static void uppercaseFromString() {

        List<Character> output = new ArrayList<>();
        String s = "Lorem Ipsum Dolor Sit Amet, Consectetur Adipiscing Elit. Morbi nec mattis odio.";
        Arrays.stream(s.split(" "))
                .filter(x -> Character.isUpperCase(x.charAt(0)))
                .map(x -> x.charAt(0))
                .forEach(output::add)
        ;

        System.out.println(output);

    }

    private static void startWithLetter(String uppercaseLetter) {

        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
        List<String> output = new ArrayList<>();
        cities.stream()
                .filter(x -> x.startsWith(uppercaseLetter))
                .map(String::toString)
                .forEach(output::add)
        ;
        System.out.println(output);
    }

    private static void concatenatedString() {

        List<Character> characters = Arrays.asList('L', 'o', 'r', 'e', 'm', ' ', 'i', 'p', 's', 'u', 'm');
        String output = characters.stream()
                .map(Object::toString)
                .reduce("", String::concat);
        System.out.println(output);
    }

    private static void frequencyOfCharacters() {

        String s = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt.";
        Map<Character, Integer> ouptut = s.chars()
                .boxed()
                .collect(Collectors.toMap(
                        k -> (char) k.intValue(),
                        v -> 1,
                        Integer::sum));
        System.out.println(ouptut);
    }
}