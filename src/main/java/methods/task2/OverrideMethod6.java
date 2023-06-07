package methods.task2;

import java.io.EOFException;

public class OverrideMethod6 extends TestClass {

    @Override
    Number testMethod(String stringArg) throws NumberFormatException {
        System.out.println("Child Method4 " + stringArg);
        return getNum();
    }
}
