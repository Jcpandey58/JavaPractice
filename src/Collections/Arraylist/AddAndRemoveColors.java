//Creates a list of 5 colors
//        Prints the size of the list
//        Removes one element by value
//        Prints the list again


package Collections.Arraylist;

import java.util.ArrayList;

public class AddAndRemoveColors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("RED");
        colors.add("Yellow");
        colors.add("RED");
        colors.add("Green");
        colors.add("Orange");

        System.out.println(colors);
        System.out.println(colors.size());
        colors.remove("RED");
        System.out.println(colors);
    }
}
