package string.firstTwo;

public class FirstTwo {

    public static String firstTwo(String str) {
        if (str.length() > 2) {
            return str.substring(0, 2);
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(firstTwo("Hello"));
        System.out.println(firstTwo("abcdefg"));
        System.out.println(firstTwo("ab"));
    }
}
