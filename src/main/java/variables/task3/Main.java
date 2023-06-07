package variables.task3;

public class Main {

    public static void main(String[] args) {
        InitializationExample example = new InitializationExample();
        System.out.println("Final Variable 1: " + example.finalVariable1);
        System.out.println("Final Variable 2: " + example.finalVariable2);
        System.out.println("Final Variable 3: " + example.finalVariable3);
        System.out.println("Static Final Variable 1: " + InitializationExample.staticFinalVariable1);
        System.out.println("Static Final Variable 2: " + InitializationExample.staticFinalVariable2);
    }
}
