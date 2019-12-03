package MorseTranslator;

import java.util.*;

public class MorseTranslator {
    public String plainTextToMorseTranslator(String plainTextString) {
        String textStringArrayWords[] = plainTextString.split(" ");
        List<List<String>> textStringArrayLetters = new ArrayList<>();
        for (int i = 0; i < textStringArrayWords.length; i++) {

            textStringArrayLetters.add(Arrays.asList(textStringArrayWords[i].split("")));
        }
        //System.out.println(textStringArrayLetters);

        StringBuilder sb = new StringBuilder();

        MorseMap mapOfMorse = new MorseMap();
        Map<String, String> textMap = mapOfMorse.getTextMap();
        int size = textStringArrayLetters.size();
        int count = 0;
        for (List<String> list : textStringArrayLetters) {
            int size2 = list.size();
            int count2 = 0;
            count++;
            for (String j : list) {
                String tempString = textMap.get(j);
                sb.append(tempString);
                count2++;
                if (count < size) {
                    sb.append(" ");
                }
                else if (count == size && count2 < size2) {
                    sb.append(" ");

                }

            }
            if (count < size) {
                sb.append("/ ");
            }

        }


        String whatever2 = sb.toString();

        return whatever2;


    }


    public String morseToPlainTextTranslator(String morseString) {
        String morseStringArrayWords[] = morseString.split(" / ");


        List<List<String>> morseStringArrayLetters = new ArrayList<>();
        for (int i = 0; i < morseStringArrayWords.length; i++) {

            morseStringArrayLetters.add(Arrays.asList(morseStringArrayWords[i].split(" ")));
        }
        //System.out.println(morseStringArrayLetters);

        StringBuilder sb = new StringBuilder();

        MorseMap mapOfMorse = new MorseMap();
        Map<String, String> morseMap = mapOfMorse.getMorseMap();


        for (List<String> list : morseStringArrayLetters) {
            for (String j : list) {
                String tempString = morseMap.get(j);
                sb.append(tempString);
            }
            sb.append(" ");
        }
        String whatever = sb.toString();
        return whatever;

    }

}
