package class_object;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("Item 1");
        list1.add("Item 2");

        List<String> list2 = new ArrayList<>();
        list2.add("Item 3");
        list2.add("Item 4");

        MyClass myClass1 = new MyClass("test1", 10, list1);
        MyClass myClass2 = new MyClass("test1", 10, list1);
        MyClass myClass3 = new MyClass("test2", 20, list2);

        System.out.println(myClass1);
        System.out.println(myClass2);
        System.out.println(myClass3);

        System.out.println(myClass1.equals(myClass2));
        System.out.println(myClass1.equals(myClass3));
    }
}
