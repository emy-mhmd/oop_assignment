;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        ArrayList<Integer> list= new ArrayList<Integer>();
         int m;
         list.add(7);
        list.add(8);
        list.add(5);
        list.add(77);
       m=  max(list);

        System.out.println("max is ="+m);

    }

     static int max(ArrayList list){
      int mx=0, x;
      int size= list.size();
      for(int i=0;i<size;i++)
      {
          x=(int)list.get(i);
          if(mx<x)
          {
              mx=x;
          }
      }
      return mx;
    }


}