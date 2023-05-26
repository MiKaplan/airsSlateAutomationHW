package methods.task1;

public class OverloadMethods {

    public void vararg(int i, int j) {
        System.out.println(i + j);
    }

    public void vararg(double x, double y, String z) {
        System.out.println("Test " + z + x + y);
    }

    public void vararg(int num, String text, boolean isFalse) {
        System.out.println("Test " + text + " ," + num + " ," + " ," + isFalse);
    }

}
