package methods.task2;

public class OverrideMethod5 extends TestClass {

    @Override
    Number testMethod(String stringArg) {
        System.out.println("Child Method4 " + stringArg);
        return getNum();
    }
}
