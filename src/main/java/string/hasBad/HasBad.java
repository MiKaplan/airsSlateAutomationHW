package string.hasBad;

public class HasBad {

    public static boolean hasBad(String str) {
        if (str.startsWith("bad")) {
            return true;
        } else if (str.substring(1, 4).equals("bad")) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasBad("badxx"));
        System.out.println(hasBad("xbadxx"));
        System.out.println(hasBad("xxbadxx"));
    }


}
