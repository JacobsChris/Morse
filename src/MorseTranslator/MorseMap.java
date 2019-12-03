package MorseTranslator;

import java.util.HashMap;
import java.util.HashMap;
import java.util.Map;


public class MorseMap {
    private String[] english = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
            "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
            ",", ".", "?"};

    private String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
            "-----", "--..--", ".-.-.-", "..--.."};
    Map<String, String> morseMap = new HashMap<>();

    public Map<String, String> getMorseMap() {
        for (int i = 0; i < english.length; i++) {
            morseMap.put(morse[i], english[i]);
        }
        return morseMap;
    }

    Map<String, String> textMap = new HashMap<>();

    public Map<String, String> getTextMap() {
        for (int i = 0; i < english.length; i++) {
            textMap.put(english[i], morse[i]);
        }
        return textMap;
    }
}
