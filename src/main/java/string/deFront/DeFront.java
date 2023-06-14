package string.deFront;

public class DeFront {

    public static String deFront(String str) {
        char firstChar = str.charAt(0);
        char secondChar = str.charAt(1);

        if (firstChar == 'a' && secondChar == 'b') {
            return str;
        } else if (firstChar == 'a') {
            return str.substring(0, 1) + str.substring(2);
        } else if (secondChar == 'b') {
            return str.substring(1);
        } else {
            return str.substring(2);
        }
    }

    public static void main(String[] args) {
        System.out.println(deFront("Hello"));
        System.out.println(deFront("java"));
        System.out.println(deFront("away"));
    }
}
