package constructor;

import java.util.List;

public class ChildClass extends BaseClass{

    private String childStringField;

    public ChildClass(String stringField, String childStringField) {
        super(stringField);
        this.childStringField = childStringField;
    }

    public ChildClass(String stringField, Integer integerField, String childStringField) {
        super(stringField, integerField);
        this.childStringField = childStringField;
    }

    public ChildClass(String stringField, Integer integerField, List<String> listField, String childStringField) {
        super(stringField, integerField, listField);
        this.childStringField = childStringField;
    }

    public ChildClass() {
        this("gephold", 1, List.of(), "");
    }

}
