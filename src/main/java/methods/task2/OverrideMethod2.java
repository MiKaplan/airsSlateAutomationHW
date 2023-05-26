package methods.task2;

public class OverrideMethod2 extends TestClass{

    @Override
    public Number testMethod(String stringArg) throws Exception {
        System.out.println("Child Method2 " + stringArg);
        return getNum();
    }
}
