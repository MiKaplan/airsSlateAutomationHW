package string.makeOutWord;

public class MakeOutWordClass {

    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2);
    }
}
