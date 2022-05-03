package T01_Apples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplesTest {

    @Test
    void getApple() {
        Apples apples = new Apples();
        assertEquals("apple", apples.getApple("apple"));

        assertEquals("aple", apples.getApple("apple"));
    }
}