// list is a interface 
// first class is grocery list
public class First {
    public static void main(String[] args) {
        GroceryList g = new GroceryList();
        g.addItem("apple"); 
        g.addItem("banana"); 
        g.addItem("potato"); 
        g.addItem("tomato"); 
        g.addItem("brinjal"); 
        System.out.println(g.findItem("tomato"));
        System.out.println(g.findItem("toma"));
        g.removeItem(4);
    }

}