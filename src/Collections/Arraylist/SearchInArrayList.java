package Collections.Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchInArrayList {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        ArrayList<String> names = new  ArrayList<>();
        names.add("alex");
        names.add("kuppusamy");
        names.add("bob");
        names.add("ramasamy");

        String searchTerm =scn.nextLine();

        if(ispresent(names,searchTerm)){
            System.out.println(searchTerm + " Present in the arraylist");
        }
        else{
            System.out.println("Uh oh..! The term "+searchTerm+" did not present in the Arraylist \nPlease check your input");
        }
    }
    static boolean ispresent(ArrayList<String> testnames, String name){
        for (String x : testnames){
            if(x.equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
//       return  testnames.contains(name.toLowerCase());
    }
}
