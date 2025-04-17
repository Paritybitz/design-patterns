package Generics;

import java.util.*;

public class ListWildCards {
    /**
     * Copies all elements from src into dst.
     *
     * @param dst the destination list—can accept items of type T or its supertypes
     * @param src the source list—provides items of type T or its subtypes
     * @param <T> the element type being copied
     */
    public static <T> void copyAll(
        List<? super T> dst,     // consumer: can write T into dst
        List<? extends T> src    // producer: can read T out of src
    ) {
        for (T item : src) {
            dst.add(item);
        }
    }

    public static void main(String[] args) {
        List<Integer>  srcInts = Arrays.asList(1, 2, 3);
        List<Number>   dstNums = new ArrayList<>();
        List<Object>   dstObjs = new ArrayList<>();

        // Copy into Number list
        copyAll(dstNums, srcInts);
        // Copy into Object list
        copyAll(dstObjs, srcInts);

        System.out.println("dstNums: " + dstNums);
        System.out.println("dstObjs: " + dstObjs);
    }
}
