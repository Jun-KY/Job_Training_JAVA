package J25_06_05;

import javax.swing.*;

public class Ascii {
    public static void main(String[] args){
        char asciiChar = 'A';
        System.out.println("Character: " + asciiChar);

        int asciiCode = (int) asciiChar;
        System.out.println(asciiCode);

        char asciiCodeToChar = (char) asciiCode;
        System.out.println(asciiCodeToChar);

        char koreanChar = '가';
        System.out.println("Character: " + koreanChar);

        int unicodeCode = (int) koreanChar;
        System.out.println("Unicode Code: U+" + Integer.toHexString(unicodeCode)
                .toUpperCase() + "(" + unicodeCode + ")");

        char unicodeToChar = (char) unicodeCode;
        System.out.println(unicodeToChar);
    }
}
