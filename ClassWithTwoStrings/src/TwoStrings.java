import java.util.Comparator;

public class TwoStrings implements Comparable<TwoStrings>{
    private String string1;
    private String string2;
    static public final Comparator<TwoStrings> comparator = new TSComparator();

    public TwoStrings(String string1, String string2) {
        this.string1 = string1;
        this.string2 = string2;
    }

    public String getString1() {
        return string1;
    }

    public void setString1(String string1) {
        this.string1 = string1;
    }

    public String getString2() {
        return string2;
    }

    public void setString2(String string2) {
        this.string2 = string2;
    }

    static private class TSComparator implements Comparator<TwoStrings> {
        @Override
        public int compare(TwoStrings o1, TwoStrings o2) {
            return o1.compareTo(o2);
        }
    }

    @Override
    public int compareTo(TwoStrings o) {
        return string1.compareTo(o.string1);
    }

    /*@Override
    public int compareTo(TwoStrings o) {
        return string2.compareTo(o.string2);
    }*/

    @Override
    public String toString() {
        return string1 + " " + string2;
    }
}
