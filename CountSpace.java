package StringClasses;

public class CountSpace {
    public static void main(String[] args) {
        String S="a b c d ";
        int Count=0;
        char [] a=S.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if(a[i]==' '){
                Count++;
            }
        }
        System.out.println(Count);
    }
}
