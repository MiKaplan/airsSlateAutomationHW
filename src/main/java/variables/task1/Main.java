package variables.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        System.out.println(task1.getIntVar());
        System.out.println(task1.getObjectVar());
        System.out.println(task1.getStringVar());
        System.out.println(task1.getIntegerVar());
        System.out.println(task1.getListVar());

        List list = new ArrayList();
        list.add(10);
        list.add(20);

        task1.setIntVar(10);
        task1.setObjectVar("Test1");
        task1.setStringVar("Test2");
        task1.setIntegerVar(100);
        task1.setListVar(list);

        System.out.println(task1.getIntVar());
        System.out.println(task1.getObjectVar());
        System.out.println(task1.getStringVar());
        System.out.println(task1.getIntegerVar());
        System.out.println(task1.getListVar());
    }
}
