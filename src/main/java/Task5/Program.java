package Task5;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
public class Program {
    public static void main(String[] args) {
        System.out.println("Привет, Мир!");
    }
    public static boolean contains(List<String> values, String value) {
        for (String v : values) {
            if (Objects.equals(value, v)) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasExactly(Collection<String> values, String value) {
        Iterator<String> iterator = values.iterator();
        return iterator.hasNext() && Objects.equals(iterator.next(), value) && !iterator.hasNext();
    }

    public static List<String> unique(List<String> values) {
        return List.copyOf(Set.copyOf(values));
    }
}
