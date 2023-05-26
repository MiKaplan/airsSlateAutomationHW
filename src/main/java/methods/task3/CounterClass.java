package methods.task3;

public class CounterClass {

    private static int counter = 0;

    public CounterClass() {
        counter++;
        System.out.println("Objects created: " + counter);
    }
}
