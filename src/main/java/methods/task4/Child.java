package methods.task4;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class Child extends Parent{

    protected static void testMethod1() {
        System.out.println("Child method 1");
    }

    public static void testMethod2() {
        System.out.println("Child method 2");
    }

    static void testMethod3() throws NumberFormatException {
        System.out.println("Child method 3");
    }

    static Integer testMethod4() {
        System.out.println("Child method 4");
        return 1;
    }

    public void testMethod5() {
        System.out.println("Child method 5");
    }
}
