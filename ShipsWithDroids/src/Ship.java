import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Ship<T>  {
    private ArrayList<T> list;
    private String name;


    public Ship(){
        list = new ArrayList<>();

    }

    public Ship(ArrayList<T> list){
        this.list = list;
    }

    public void add(T t){
        list.add(t);
    }

    public T get(int index){
        return list.get(index);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<T> getList() {
        return (ArrayList<T>) list.clone();
    }

    public void setList(ArrayList<T> list) {
        this.list = list;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Ship((ArrayList<T>)list.clone());
    }
}
