package methods.task1;

public class RunMethods {

    public static void main(String[] args) {
        OverloadMethods methods = new OverloadMethods();

        methods.vararg(1, 2);
        methods.vararg(10.2, 5.3, "Test111");
        methods.vararg(1, "test222", false);
    }
}
