package string.extraEnd;

public class ExtraEndClass {

    public static String extraEnd(String str) {
        String substring = str.substring(str.length() - 2);

        return substring + substring + substring;
    }
}
