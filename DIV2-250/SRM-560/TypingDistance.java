import java.util.*;

public class TypingDistance {

    public int minDistance(String keyboard, String word) {
        int res = 0;
        
        for (int i = 1; i < word.length(); i++) {
            int k = keyboard.indexOf(word.charAt(i -1));
            int l = keyboard.indexOf(word.charAt(i));
            
            res += Math.abs(k - l);
        }
        
        return res;
    }

}