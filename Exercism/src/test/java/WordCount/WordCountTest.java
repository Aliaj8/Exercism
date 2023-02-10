package WordCount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

public class WordCountTest {
    @Test
    void count_one_word() {
        WordCount wordCount = new WordCount();
        Map<String, Integer> expected = new HashMap<>();
        expected.put("word",1);

        Map<String, Integer> actual = new HashMap<>();
        actual = wordCount.phrase("word");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void count_one_of_each_word() {
        WordCount wordCount = new WordCount();
        Map<String, Integer> expected = new HashMap<>();
        expected.put("one",1);
        expected.put("of",1);
        expected.put("each",1);

        Map<String, Integer> actual = new HashMap<>();
        actual = wordCount.phrase("one of each");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void multiple_occurrences_of_a_word() {
        WordCount wordCount = new WordCount();
        Map<String, Integer> expected = new HashMap<>();
        expected.put("one",1);
        expected.put("fish",4);
        expected.put("two",1);
        expected.put("red",1);
        expected.put("blue",1);

        Map<String, Integer> actual = new HashMap<>();
        actual = wordCount.phrase("one fish two fish red fish blue fish");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void handles_cramped_lists() {
        WordCount wordCount = new WordCount();
        Map<String, Integer> expected = new HashMap<>();
        expected.put("one",1);
        expected.put("two",1);
        expected.put("three",1);

        Map<String, Integer> actual = new HashMap<>();
        actual = wordCount.phrase("one,two,three");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void handles_expanded_lists() {
        WordCount wordCount = new WordCount();
        Map<String, Integer> expected = new HashMap<>();
        expected.put("one",1);
        expected.put("two",1);
        expected.put("three",1);

        Map<String, Integer> actual = new HashMap<>();
        actual = wordCount.phrase("one,\ntwo,\nthree");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ignore_punctuation() {
        WordCount wordCount = new WordCount();
        Map<String, Integer> expected = new HashMap<>();
        expected.put("car",1);
        expected.put("carpet",1);
        expected.put("as",1);
        expected.put("java",1);
        expected.put("javascript",1);

        Map<String, Integer> actual = new HashMap<>();
        actual = wordCount.phrase("car : carpet as java : javascript!!&@$%^&");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void include_numbers() {
        WordCount wordCount = new WordCount();
        Map<String, Integer> expected = new HashMap<>();
        expected.put("testing",2);
        expected.put("1",1);
        expected.put("2",1);

        Map<String, Integer> actual = new HashMap<>();
        actual = wordCount.phrase("testing, 1, 2 testing");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void with_apostrophes() {// to lowercase and apostrophes ( ...'char)
        WordCount wordCount = new WordCount();
        Map<String, Integer> expected = new HashMap<>();
        expected.put("first", 1);
        expected.put("don't", 2);
        expected.put("laugh", 1);
        expected.put("then", 1);
        expected.put("cry", 1);

        Map<String, Integer> actual = new HashMap<>();
        actual = wordCount.phrase("First: don't laugh. Then: don't cry.");
        Assertions.assertEquals(expected, actual);
    }
}
