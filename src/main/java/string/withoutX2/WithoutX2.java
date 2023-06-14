package string.withoutX2;

public class WithoutX2 {

    public static String withoutX2(String str) {
        if (str.charAt(0) == 'x' && str.charAt(1) == 'x') {
            return str.substring(2);
        } else if (str.charAt(0) == 'x') {
            return str.substring(1);
        } else if (str.charAt(1) == 'x') {
            return str.charAt(0) + str.substring(2);
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(withoutX2("xHi"));
        System.out.println(withoutX2("Hxi"));
        System.out.println(withoutX2("Hi"));
    }
}
