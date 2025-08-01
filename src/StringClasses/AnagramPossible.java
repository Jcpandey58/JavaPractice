package StringClasses;

import java.util.Arrays;

public class AnagramPossible {
    
    public static void main(String[] args) {
        String S1 = "listenqw";
        String S2 = "siluuent";
        char [] ch1 = S1.toCharArray();
        char [] ch2 = S2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(ch1.length==ch2.length){   
            for(int i=0; i< ch2.length; i++) {
                if (ch1[i]!=ch2[i]) {
                    System.out.println("Anagrom is not possible");
                    break;
                }
                else{
                    System.out.println("Anagram possible");
                }

            }
        }
        else {
            System.out.println("Anagram is not possible bcoz the character count is not matched for the strings");
        }


    }
}
