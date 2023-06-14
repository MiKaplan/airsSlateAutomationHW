package string.lastChars;

public class LastCharsClass {

    public String lastChars(String a, String b) {
//        if (a.length() == 0) {
//            a = "@";
//        }
//        if (b.length() == 0) {
//            b = "@";
//        }
//
//        return Character.toString(a.charAt(0)) + b.charAt(b.length() - 1);

        return Character.toString(a.length() > 0 ? a.charAt(0) : '@') + (b.length() > 0 ? b.charAt(b.length() - 1) : '@');
    }

}
