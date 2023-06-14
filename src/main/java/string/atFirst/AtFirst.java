package string.atFirst;

public class AtFirst {

    public static String atFirst(String str) {
        if (str.length() < 2) {
            return str + "@";
        }
        return str.substring(0, 2);
    }

    public static void main(String[] args) {
        System.out.println(atFirst("hello"));
        System.out.println(atFirst("hi"));
        System.out.println(atFirst("h"));
    }
}
