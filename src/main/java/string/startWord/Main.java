package string.startWord;

public class Main {

    public static void main(String[] args) {
        StartWord startWord = new StartWord();

        System.out.println(startWord.startWord("hippo", "hi"));
        System.out.println(startWord.startWord("hippo", "xip"));
        System.out.println(startWord.startWord("hippo", "i"));
    }
}
