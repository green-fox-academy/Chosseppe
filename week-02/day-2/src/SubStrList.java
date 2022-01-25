public class SubStrList {

    public static void main(String[] args) {

        //  Create a function that takes a string (`needle`) and a list of strings (`haystack`) as parameters
        //  and returns the index of the list element which contains the `needle` as a substring.
        //  You only need to find the first occurrence and return that index. The search should be case-sensitive!
        //  Return `-1` if none of the items in the list contain the `needle`.

        // Example

        String[] haystack = new String[] {"this", "is", "what", "I'm", "searching"};

        // Expected output: 4
        System.out.println(findIndex("ching", haystack));

        // Expected output: -1
        System.out.println(findIndex("not", haystack));

        /**
        // Expected output: 0
        System.out.println(findIndex("his", haystack));

         */
    }

    private static int findIndex(String searchedString, String[] searchingStringHere){
        int output = 0;
        int counter = 0;
        for(String word : searchingStringHere){
            counter ++;
            if(word.contains(searchedString)){
                output = counter - 1;
                break;
            }else{
                output = -1;
            }
        }
        return output;
    }
}