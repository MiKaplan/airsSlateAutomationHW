package string.nTwice;

public class NTwice {

    public static String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

    public static void main(String[] args) {
        System.out.println(nTwice("Hello", 2));
        System.out.println(nTwice("Chocolate", 3));
        System.out.println(nTwice("Chocolate", 1));
    }
}
