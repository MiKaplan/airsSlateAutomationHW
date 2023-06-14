package string.lastChars;

public class Main {

    public static void main(String[] args) {
        LastCharsClass lastCharsClass = new LastCharsClass();

        System.out.println(lastCharsClass.lastChars("last", "chars"));
        System.out.println(lastCharsClass.lastChars("yo", "java"));
        System.out.println(lastCharsClass.lastChars("hi", ""));
    }
}
