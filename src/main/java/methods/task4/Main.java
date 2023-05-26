package methods.task4;

public class Main {

    public static void main(String[] args) throws Exception {
        Child child = new Child();

        Child.testMethod1();
        Child.testMethod2();
        Child.testMethod3();
        Child.testMethod4();
        child.testMethod5();

        Parent.testMethod1();
        Parent.testMethod2();
        Parent.testMethod3();
        Parent.testMethod4();
        child.testMethod5();
    }
}
