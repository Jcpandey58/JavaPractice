package StringClasses;

import java.util.Arrays;

public class FreqChar {
    public static void main(String[] args) {
        String txt="werrtyeusadoa";
        int Count=1;
        char[]ch=txt.toCharArray();
        Arrays.sort(ch);
        for (int i = 0; i < ch.length-1; i++) {
          if(ch[i+1]==ch[i]){
              Count++;
              System.out.println(ch[i]);
              System.out.println(Count);
          }
        }
    }
}
