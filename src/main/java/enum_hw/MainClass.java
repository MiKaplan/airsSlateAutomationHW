package enum_hw;

public class MainClass {

    public static void main(String[] args) {
        Human qa = Human.QA;
        Human aqa = Human.AQA;
        Human dev = Human.DEV;

        qa.printInfo();
        aqa.printInfo();
        dev.printInfo();
    }
}
