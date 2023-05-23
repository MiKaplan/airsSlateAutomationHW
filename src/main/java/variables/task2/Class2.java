package variables.task2;

public class Class2 extends Class1{

    private int x = 30;

    @Override
    public void display() {
        int x = 40;
        System.out.println(this.x);
        System.out.println(x);
    }

}
