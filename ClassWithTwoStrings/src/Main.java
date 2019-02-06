import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    static public void main(String ... args){
        ArrayList<TwoStrings> arr = new ArrayList<>();
        arr.add(new TwoStrings("Ukraine", "poor"));
        arr.add(new TwoStrings("USA", "reach"));
        arr.add(new TwoStrings("Poland", "normal"));
        arr.add(new TwoStrings("Finland", "very rich"));

        arr.sort(TwoStrings.comparator);
        for (TwoStrings t : arr) System.out.println(t);

        System.out.println(Collections.binarySearch(arr,new TwoStrings("Ukraine", "don't care")));
    }
}
