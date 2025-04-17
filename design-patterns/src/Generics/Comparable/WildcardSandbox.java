package Generics.Comparable;
import java.lang.Integer;

import java.util.*;

public class WildcardSandbox {
    public static void main(String[] args) {
        demoExtends();
        demoSuper();
    }

    static void demoExtends() {
        System.out.println("=== demoExtends ===");
        List<Integer>      listInt    = new ArrayList<>(List.of(1, 2, 3));
        List<PositiveInt>  listPos    = new ArrayList<>(List.of(new PositiveInt(5), new PositiveInt(7)));
        List<NegativeInt>  listNeg    = new ArrayList<>(List.of(new NegativeInt(-1), new NegativeInt(-2)));
        
        List<? extends Integer> lei;   // unknown subtype of Integer

        // Assignments:
        lei = listInt;   // ✅ Integer extends Integer
        lei = listPos;   // ✅ PositiveInt extends Integer
        lei = listNeg; // ✅ NegativeInt extends Integer
        
        Integer i; 
        Number  n; 
        Object  o;
        PositiveInt p;

        // Reading:
        o = lei.get(0);    // ✅ always OK: any Integer‑subclass is an Object
        n = lei.get(0);    // ✅ OK: any Integer‑subclass is a Number
        i = lei.get(0);    // ✅ OK: any X extends Integer
        p = lei.get(0);  // ❌ ERROR: X might not be PositiveInt

        // Writing:
        lei.add(42);     // ❌ ERROR: cannot add Integer
        lei.add(new Integer(9)); // ❌ ERROR
        lei.add(new PositiveInt(3)); // ❌ ERROR
        lei.add(null);     // ✅ only null is allowed

        System.out.println("Read i, n, o OK; cannot add except null.\n");
    }

    static void demoSuper() {
        System.out.println("=== demoSuper ===");
        List<Object>      listObj   = new ArrayList<>();
        List<Number>      listNum   = new ArrayList<>();
        List<Integer>     listInt   = new ArrayList<>();
        
        List<? super Integer> lsi;  // unknown supertype of Integer

        // Assignments:
        lsi = listObj;   // ✅ Object is super of Integer
        lsi = listNum;   // ✅ Number is super of Integer
        lsi = listInt;   // ✅ Integer is super of Integer

        Integer i; 
        Number  n; 
        Object  o;
        PositiveInt p;

        // Reading:
        o = lsi.get(0);   // ✅ OK: only Object guaranteed
        n = lsi.get(0); // ❌ ERROR: might be Object
        i = lsi.get(0); // ❌ ERROR
        p = lsi.get(0); // ❌ ERROR

        // Writing:
        lsi.add(o);     // ❌ ERROR: o is Object
        lsi.add(n);     // ❌ ERROR: n is Number
        lsi.add(42);      // ✅ OK: Integer
        lsi.add(new PositiveInt(9)); // ✅ OK: subclass of Integer
        lsi.add(null);    // ✅ OK

        System.out.println("Can add Integer/subclasses; read only as Object.\n");
    }

    // example subclasses
    static class PositiveInt extends Integer {
        public PositiveInt(int value) {
            super(value);
        }
        @Override
        public String toString() {
            return "PositiveInt(" + intValue() + ")";
        }
    }
    static class NegativeInt extends Integer {
        public NegativeInt(int value) {
            super(value);
        }
        @Override
        public String toString() {
            return "NegativeInt(" + intValue() + ")";
        }
    }
}
