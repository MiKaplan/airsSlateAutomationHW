package string.withoutEnd2;

public class WithoutEnd2 {

    public static String withoutEnd2(String str) {
        return str.substring(1, str.length() - 1);
    }

    public static void main(String[] args) {
        System.out.println(withoutEnd2("Hello"));
        System.out.println(withoutEnd2("abc"));
        System.out.println(withoutEnd2("ab"));
    }
}
