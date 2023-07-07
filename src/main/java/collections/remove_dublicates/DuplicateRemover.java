package collections.remove_dublicates;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateRemover {

    public static Collection removeDuplicatesWithHashSet(Collection collection) {
        return new HashSet(collection);
    }
    public static Collection removeDuplicatesWithLinkedHashSet(Collection collection) {
        return new LinkedHashSet(collection);
    }
    public static Collection removeDuplicatesWithStream(Collection collection) {
        return (Collection) collection.stream().distinct().collect(Collectors.toList());
    }
}
