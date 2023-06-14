package string.nonStart;

public class NonStartClass {

    public String nonStart(String a, String b) {
        if (a.length() < 1 || b.length() < 1) {
            throw new StringIndexOutOfBoundsException("Strings must have a length of at least 1.");
        }

        return a.substring(1) + b.substring(1);
    }
}
