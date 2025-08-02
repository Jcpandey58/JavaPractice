//Create a list: ["apple", "banana", "apple", "orange", "banana"]
//Remove only the first occurrence of "banana"
//Print the updated list

package Collections.Arraylist;

import java.util.ArrayList;

public class DuplicateHandling {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana" );
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        System.out.println("Array before removal: "+ fruits);
        for (int i = 0; i < fruits.size(); i++) {
           if(fruits.get(i).equals("banana")){
              fruits.remove(i);
              break;
           }
        }
        System.out.println("Array after removal: "+ fruits);
    }
}
