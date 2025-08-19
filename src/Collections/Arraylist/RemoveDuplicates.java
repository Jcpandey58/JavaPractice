// Remove Duplicates from a list (Maintain original Order) [Array + Collection logic]

package Collections.Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> browsers = Arrays.asList("chrome", "Firefox", "chrome", "edge", "Safari");

        // New list to store unique items
        List<String> uniqueBrowsers = new ArrayList<>();

        // Loop through each browser in the original list
        for (String browser : browsers) {
            boolean alreadyExists = false;

            // Check if the browser (ignoring case) is already in uniqueBrowsers
            for (String unique : uniqueBrowsers) {
                if (unique.equalsIgnoreCase(browser)) {
                    alreadyExists = true;
                    break;
                }
            }

            // If not found, add it to uniqueBrowsers
            if (!alreadyExists) {
                uniqueBrowsers.add(browser);
            }
        }

        // Print the result
        System.out.println("Output: " + String.join(", ", uniqueBrowsers));
    }
}
