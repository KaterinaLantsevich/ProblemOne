package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProblemOneTest {

    private ProblemOne problemOne;

    @BeforeEach
    public void setup() {
        problemOne = new ProblemOne();
    }

    @Test
    public void testIsAnagram_SameWord_ReturnsTrue() {
        String word = "katja";
        boolean result = problemOne.isAnagram(word, word);
        Assertions.assertTrue(result);
    }

    @Test
    public void testIsAnagram_Anagrams_ReturnsTrue() {
        String word1 = "katja";
        String word2 = "atjak";
        boolean result = problemOne.isAnagram(word1, word2);
        Assertions.assertTrue(result);
    }

    @Test
    public void testIsAnagram_NotAnagrams_ReturnsFalse() {
        String word1 = "katja";
        String word2 = "latja";
        boolean result = problemOne.isAnagram(word1, word2);
        Assertions.assertFalse(result);
    }

    @Test
    public void testIsAnagram_DifferentCase_ReturnsTrue() {
        String word1 = "Katja";
        String word2 = "atjak";
        boolean result = problemOne.isAnagram(word1, word2);
        Assertions.assertTrue(result);
    }
}
