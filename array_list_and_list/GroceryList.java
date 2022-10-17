
import java.util.*;

public class GroceryList {
    private ArrayList<String> glist = new ArrayList<>();   

    public ArrayList<String> addItem(String item){
        glist.add(item);
        return glist;
    }

    public void printList(){
        System.out.println("You have : " + glist.size() + " items");
        for(int i = 0; i < glist.size(); i++){
            System.out.println((i+1) + ". " + glist.get(i));
        }
    }

    public void updateItem(String name, int position){
        glist.set(position, name);
    }

    public void removeItem(int position){
        String item = glist.get(position);
        glist.remove(position);
        System.out.println("Removed : " + item);
    }

    public String findItem(String item){
        boolean exists = glist.contains(item);
        if(exists){
            int pos = glist.indexOf(item);
            return glist.get(pos);
        }
        return "Not found";
    }


    // public static void main(String[] args) {
    //     addItem("Apple");
    //     addItem("Banana");
    //     addItem("Brinjal");
    //     addItem("Potato");
    //     printList();
    //     // System.out.println(myList);
    //     updateItem("Mashed Potatoes", 3);
    //     printList();
    //     removeItem(2);
    //     printList();
    //     System.out.println(findItem("Tomato"));
    //     System.out.println(findItem("Apple"));
    // }
}
