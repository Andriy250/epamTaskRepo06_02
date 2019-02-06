import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ttemp { //4th task

    static public void main(String ... args){
       /* List list = new ArrayList();

        list.add(8);
        list.add("String");

        for (Object o : list)
            System.out.println(o);

        //String s = list.get(0);*/

       List<Integer> list = new ArrayList<>();
       list = addStringToList(list);
        for (Object o : list)
            System.out.println(o);

    }

    static private List addStringToList(List list){
        list.add("sdf");
        return list;
    }
}
