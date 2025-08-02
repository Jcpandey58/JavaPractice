package Collections.Arraylist;

import java.util.ArrayList;

public class ArrayListPrac {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Alice");  // duplicates allowed

        System.out.println("Names: " + names);        // [Alice, Bob, Alice]
        System.out.println("Size: " + names.size());  // 3

        names.remove("Bob");
        System.out.println("After removal: " + names);  // [Alice, Alice]

        System.out.println("Contains 'Alice'? " + names.contains("Alice")); // true
    }
}
