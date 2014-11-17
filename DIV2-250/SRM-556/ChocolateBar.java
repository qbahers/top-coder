import java.util.*;

public class ChocolateBar {

    public int maxLength(String letters) {
        int N = letters.length();
        
        int res = 0;
        for (int i = 0; i < N; i++)
            for (int j = i + 1; j <= N; j++) {
                Set<Character> set = new HashSet<Character>();
                char[] a = letters.substring(i, j).toCharArray();
                for (char x : a) set.add(x);
                
                if (set.size() == j - i) res = Math.max(res, j - i);
            }
        
        return res;
    }

}