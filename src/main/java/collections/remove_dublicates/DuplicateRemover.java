package collections.remove_dublicates;

import java.util.Collection;
import java.util.HashSet;

public class DuplicateRemover {

    public static Collection removeDuplicates(Collection collection) {
        return new HashSet(collection);
    }
}
