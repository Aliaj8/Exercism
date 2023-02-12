package Scrabble;

import java.util.HashMap;

public class Scrabble {
private final String letter;
    public Scrabble(String letter) {
        this.letter=letter.toUpperCase();
    }

    public int getScore() {
        HashMap<Character, Integer> wordGame = getDictionary();

        int result=0;
        char[] chars = getLetter().toCharArray();
        for (char word : chars) {
            int temp=wordGame.get(word);
            result+=temp;
        }
        return result;
    }

    private static HashMap<Character, Integer> getDictionary() {
        HashMap<Character, Integer> wordGame = new HashMap<>();
        wordGame.put('A',1);
        wordGame.put('B',3);
        wordGame.put('C',3);
        wordGame.put('D',2);
        wordGame.put('E',1);
        wordGame.put('F',4);
        wordGame.put('G',2);
        wordGame.put('H',4);
        wordGame.put('I',1);
        wordGame.put('J',8);
        wordGame.put('K',5);
        wordGame.put('L',1);
        wordGame.put('M',3);
        wordGame.put('N',1);
        wordGame.put('O',1);
        wordGame.put('P',3);
        wordGame.put('Q',10);
        wordGame.put('R',1);
        wordGame.put('S',1);
        wordGame.put('T',1);
        wordGame.put('U',1);
        wordGame.put('V',4);
        wordGame.put('W',4);
        wordGame.put('X',8);
        wordGame.put('Y',4);
        wordGame.put('Z',10);
        return wordGame;
    }

    public String getLetter() {
        return letter;
    }
}
