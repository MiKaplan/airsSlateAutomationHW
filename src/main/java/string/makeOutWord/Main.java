package string.makeOutWord;

public class Main {

    public static void main(String[] args) {
        MakeOutWordClass makeOutWordClass = new MakeOutWordClass();
        System.out.println(makeOutWordClass.makeOutWord("<<>>", "Yay"));
        System.out.println(makeOutWordClass.makeOutWord("<<>>", "WooHoo"));
        System.out.println(makeOutWordClass.makeOutWord("[[]]", "word"));
    }
}
