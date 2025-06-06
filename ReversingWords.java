package StringClasses;

public class ReversingWords {
    public static void main(String[] args) {
        String S1 = "we r three";
        String S2 ="";
        String [] words = S1.split(" ");
        for (int i=words.length-1; i>=0; i--) {
            S2+=words[i]+" ";
        }
        System.out.println(S2.trim());
    }
}
