package constructor;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        BaseClass baseClass1 = new BaseClass("base string1");
        BaseClass baseClass2 = new BaseClass("base string2", 20);
        BaseClass baseClass3 = new BaseClass("base string3", 30, List.of("item1", "item2"));

        ChildClass childClass1 = new ChildClass();
        ChildClass childClass2 = new ChildClass("base string1", "child string1");
        ChildClass childClass3 = new ChildClass("base string2", 2, "child string2");
        ChildClass childClass4 = new ChildClass("base string3", 3, List.of("item1", "item2"), "child string2");

        GrandChildClass grandChildClass1 = new GrandChildClass();
        GrandChildClass grandChildClass2 = new GrandChildClass("base string1", "child string1", "grandchild string1");
        GrandChildClass grandChildClass3 = new GrandChildClass("base string2", 2,"child string2","grandchild string1");
        GrandChildClass grandChildClass4 = new GrandChildClass("base string3", 3, List.of("item1", "item2"), "child string2","grandchild string1");

    }
}
