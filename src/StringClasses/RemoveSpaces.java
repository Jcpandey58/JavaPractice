package StringClasses;

public class RemoveSpaces {
    public static void main(String[] args) {
        String S1 = "Welcome to the class";
        S1 = S1.replaceAll(" ","");
//        String S2="";
//        char [] ch = S1.toCharArray();
//        for (int i=0; i<ch.length; i++) {
//            if(ch[i]!=' ') {
//                S2 = S2+ch[i];
//            }
//        }
        System.out.print(S1);
    }
}
