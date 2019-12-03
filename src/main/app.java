package main;

import MorseTranslator.MorseTranslator;

public class app {
    public static void main(String[] args) {

        String morseString = ".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--";
        MorseTranslator something = new MorseTranslator();
        String textifiedMorse = something.morseToPlainTextTranslator(morseString);
        System.out.println(textifiedMorse);

        String textString = "hello daily programmer good luck on the challenges today";
        String morseifiedText = something.plainTextToMorseTranslator(textString);
        System.out.println(morseifiedText);

        if (morseifiedText.equals(morseString)){
            System.out.println("They are equal.");
        }

    }
}
