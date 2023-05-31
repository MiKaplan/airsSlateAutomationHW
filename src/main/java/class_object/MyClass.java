package class_object;

import java.util.List;
import java.util.Objects;

public class MyClass {

    private final String stringField;
    private final Integer integerField;
    private final List<String> listField;

    public MyClass(String stringField, Integer integerField, List<String> listField) {
        this.stringField = stringField;
        this.integerField = integerField;
        this.listField = listField;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "stringField='" + stringField + '\'' +
                ", integerField=" + integerField +
                ", listField=" + listField +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof MyClass)) {
            return false;
        }

        MyClass otherClass = (MyClass) obj;

        return Objects.equals(stringField, otherClass.stringField)
                && Objects.equals(integerField, otherClass.integerField)
                && Objects.equals(listField, otherClass.listField);
    }
}
