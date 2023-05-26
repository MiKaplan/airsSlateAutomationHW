package methods.task2;

public class TestClass {
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    Number testMethod(String stringArg) throws Exception {
        System.out.println("Parent method " + stringArg);
        return num;
    }

}
