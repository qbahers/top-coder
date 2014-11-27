import java.util.*;

public class GooseTattarrattatDiv2 {

    public int getmin(String S) {
        int[] freq = new int[26];
        
        for (int i = 0; i < S.length(); i++)
            freq[S.charAt(i) - 'a']++;
        
        Arrays.sort(freq);
        
        int res = 0;
        for (int i = 0; i < 25; i++)
            res += freq[i];
        
        return res;
    }

}