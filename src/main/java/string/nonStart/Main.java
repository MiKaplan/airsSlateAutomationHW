package string.nonStart;

public class Main {

    public static void main(String[] args) {
        NonStartClass nonStartClass = new NonStartClass();

        try {
            System.out.println(nonStartClass.nonStart("Hello", "There"));
            System.out.println(nonStartClass.nonStart("java", "code"));
            System.out.println(nonStartClass.nonStart("shotl", "java"));
            System.out.println(nonStartClass.nonStart("", "java"));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }
}
