package countLetters;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CountLettersTest {

    @Test
    void dictionary() {

        Map<Character, Integer> keyCounter = CountLetters.dictionary("""
                I am already far north of London, and as I walk in the streets of
                Petersburgh, I feel a cold northern breeze play upon my cheeks, which
                braces my nerves and fills me with delight.""");

        assertEquals(3, keyCounter.get('I'));
        assertEquals(8, keyCounter.get('t'));
        assertEquals(3, keyCounter.get('w'));
        assertEquals(1, keyCounter.get('.'));
    }
}