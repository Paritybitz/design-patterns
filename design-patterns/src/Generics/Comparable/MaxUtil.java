package Generics.Comparable;

public class MaxUtil {
    public static <E extends Comparable<E>> E max(E o1, E o2) {
        return (o1.compareTo(o2) > 0) ? o1 : o2;
    }
}
