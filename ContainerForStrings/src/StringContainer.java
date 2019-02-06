import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class StringContainer {

    private String[] arr;

    public StringContainer(){
        arr = new String[0];
    }

    public StringContainer(String[] arr){
        System.arraycopy(arr, 0, this.arr,0,arr.length);
    }

    public String get(int index){
        return arr[index];
    }

    public void add(String s){
        String[] newArr = new String[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        newArr[arr.length] = s;
        arr = newArr;
    }

    public int size(){
        return arr.length;
    }

}
