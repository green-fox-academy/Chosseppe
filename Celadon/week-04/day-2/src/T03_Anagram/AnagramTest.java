package T03_Anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void isAnagram() {
        Anagram isAnagram = new Anagram();

        assertEquals(true, Anagram.isAnagram("god", "dog"));
        assertEquals(false, Anagram.isAnagram("vitana", "latina"));
        assertEquals(true, Anagram.isAnagram("fried", "fired"));
        assertEquals(true, Anagram.isAnagram("listen", "silent"));
        assertEquals(false, Anagram.isAnagram("vietnam", "laos"));

    }
}