package methods.task2;

public class OverrideMethod1 extends TestClass{

    @Override
    Number testMethod(String stringArg) throws Exception {
        return super.testMethod(stringArg);
    }
}
