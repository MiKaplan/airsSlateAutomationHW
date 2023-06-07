package constructor;

import java.util.List;

public class BaseClass {

    private String stringField;
    private Integer integerField;
    private List<String> listField;

    public BaseClass(String stringField) {
        this.stringField = stringField;
    }

    public BaseClass(String stringField, Integer integerField) {
        this.stringField = stringField;
        this.integerField = integerField;
    }

    public BaseClass(String stringField, Integer integerField, List<String> listField) {
        this.stringField = stringField;
        this.integerField = integerField;
        this.listField = listField;
    }
}
