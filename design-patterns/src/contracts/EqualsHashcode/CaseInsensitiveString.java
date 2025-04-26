package contracts.EqualsHashcode;

// Broken - violates symmetry!
public final class CaseInsensitiveString {
    private final String s;

    // public CaseInsensitiveString(String s) {
    // this.s = Object.requireNonNull(s);}

    // // Broken - violates symmetry!
    // @Override public boolean equals(Object o) {
    // if (o instanceof CaseInsensitiveString)
    // return s.equalsIgnoreCase(
    // ((CaseInsensitiveString) o).s);
    // if (o instanceof String) // One-way interoperability!
    // return s.equalsIgnoreCase((String) o);
    // return false;
    // }
    //Remainder omitted

    @Override
    public boolean equals(Object o) {
        return o instanceof CaseInsensitiveString &&
                ((CaseInsensitiveString) o).s.equalsIgnoreCase(s);
    }
}