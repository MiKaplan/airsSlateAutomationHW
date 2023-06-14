package string.theEnd;

public class Main {

    public static void main(String[] args) {
        TheEndClass theEndClass = new TheEndClass();

        System.out.println(theEndClass.theEnd("Hello", true));
        System.out.println(theEndClass.theEnd("Hello", false));
        System.out.println(theEndClass.theEnd("oh", true));
    }
}
