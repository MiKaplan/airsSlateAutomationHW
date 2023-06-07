package methods.task2;

public class OverrideMethod4 extends TestClass {

    @Override
    Integer testMethod(String stringArg) throws Exception {
        System.out.println("Child Method4 " + stringArg);
        return getNum();
    }
}
