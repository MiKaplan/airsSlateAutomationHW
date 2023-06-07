package methods.task2;

public class OverrideMethod3 extends TestClass {

    @Override
    Number testMethod(String stringArg) throws Exception {
        System.out.println("Child Method3 " + stringArg);
        return getNum();
    }
}
