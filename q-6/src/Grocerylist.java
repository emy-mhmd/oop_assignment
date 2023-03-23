import java.util.ArrayList;
public class Grocerylist {

GroceryItemOrder [] g;
 int num;

public Grocerylist()
{
    g=new GroceryItemOrder[10];
    num=0;
}

public void add(GroceryItemOrder item)
{
    if(num!=10)
    {
        this.g[num]=item;
        this.num++;

    }



}
    public double getTotalCost()
    {
        double total_cost=0;
        for(int i=0;i<this.num;i++)
        {
            total_cost+=this.g[i].getCost();
        }
        return total_cost;

    }
}
