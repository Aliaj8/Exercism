package Scrabble;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ScrabbleScoreTest {
    @Test
    void a_lower_case_letter() {
        Scrabble scrabble = new Scrabble("a");
        Assertions.assertEquals(1, scrabble.getScore());
    }

    @Test
    void a_upper_case_letter() {
        Scrabble scrabble = new Scrabble("A");
        Assertions.assertEquals(1, scrabble.getScore());
    }

    @Test
    void a_value_able_letter() {
        Scrabble scrabble = new Scrabble("f");
        Assertions.assertEquals(4, scrabble.getScore());
    }

    @Test
    void a_short_word() {
        Scrabble scrabble = new Scrabble("at");
        Assertions.assertEquals(2, scrabble.getScore());
    }

    @Test
    void a_medium_word() {
        Scrabble scrabble = new Scrabble("OxyphenButazone");
        Assertions.assertEquals(41, scrabble.getScore());
    }

    @Test
    void a_empty_input() {
        Scrabble scrabble = new Scrabble("");
        Assertions.assertEquals(0, scrabble.getScore());
    }
}
