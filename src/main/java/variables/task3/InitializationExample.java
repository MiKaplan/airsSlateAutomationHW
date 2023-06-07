package variables.task3;

public class InitializationExample {

        final int finalVariable1 = 10;

        final int finalVariable2;
        {
            finalVariable2 = 20;
        }

        final int finalVariable3;
        public InitializationExample() {
            finalVariable3 = 30;
        }

        static final int staticFinalVariable1 = 40;

        static final int staticFinalVariable2;
        static {
            staticFinalVariable2 = 50;
        }
}
