package WordCount;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WordCount {
    public Map<String, Integer> phrase(String word) {
        String regex="[^A-Za-z0-9']|'\\B|\\B'";
        String sentence=word.replaceAll(regex," ");
        String[] ArryWord=sentence.toLowerCase().split("\\s+");

        int count=0;
        HashMap<String, Integer> word_count = new HashMap<>();
        for (String words : ArryWord) {
            for (String value : ArryWord) {
                if (Objects.equals(words, value)) {
                    count+=1;
                    word_count.put(words, count);
                }
            }
            count=0;
        }
        return word_count;
    }
}
