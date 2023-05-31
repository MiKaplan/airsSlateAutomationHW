package constructor;

import java.util.List;

public class GrandChildClass extends ChildClass{

    private String grandChildField;

    public GrandChildClass() {
        super();
    }

    public GrandChildClass(String stringField, String childStringField, String grandChildField) {
        super(stringField, childStringField);
        this.grandChildField = grandChildField;
    }

    public GrandChildClass(String stringField, Integer integerField, String childStringField, String grandChildField) {
        super(stringField, integerField, childStringField);
        this.grandChildField = grandChildField;
    }

    public GrandChildClass(String stringField, Integer integerField, List<String> listField, String childStringField, String grandChildField) {
        super(stringField, integerField, listField, childStringField);
        this.grandChildField = grandChildField;
    }
}
