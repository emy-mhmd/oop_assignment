

import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(7);
        list.add(1);
        list.add(17);
        list.add(5);
        sort(list);

        System.out.println(list);
    }

    static void sort(ArrayList list)
    {
        Collections.sort(list);
    }
}