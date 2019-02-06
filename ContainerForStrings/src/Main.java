import java.util.ArrayList;

public class Main {

    static public void main(String ... args){
        StringContainer stringContainer = new StringContainer();

        stringContainer.add("Foo");
        stringContainer.add("Bar");
        System.out.println("my StringContainer");
        for (int i = 0 ; i < stringContainer.size(); ++i)
            System.out.println(stringContainer.get(i));

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Foo");
        arrayList.add("Bar");
        System.out.println("ArrayList");
        for (String s : arrayList){
            System.out.println(s);
        }
    }
}
