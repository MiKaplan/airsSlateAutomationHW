package variables.task2;

public class Class3 extends Class2{

    int x = 50;

    @Override
    public void display() {
        int x = 60;
        System.out.println(this.x);
        System.out.println(x);
    }
}
