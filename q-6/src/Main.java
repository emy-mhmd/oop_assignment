import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

         Grocerylist gor=new Grocerylist();
         GroceryItemOrder gitem=new GroceryItemOrder("apple",2,4);
         gitem.setQuantity(3);
        System.out.println("the cost is"+gitem.getCost());
        gor.add(gitem);
        GroceryItemOrder go2 = new GroceryItemOrder("peas", 4, 2);
        gor.add( go2 );
        System.out.println("The total cost of groceries"+ gor.getTotalCost() );
    }
}