import java.util.*;

public class ValueOfString {

    public int findValue(String s) {
        int N = s.length();
        
        int res = 0;
        for (int i = 0; i < N; i++) {
        
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (s.charAt(j) <= s.charAt(i)) count++;
            }
            
            res += count * (s.charAt(i) - 'a' + 1);
        }
        
        return res;
    }

}