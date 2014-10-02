import java.util.*;

public class FoxAndWord {

    public int howManyPairs(String[] words) {
        int N = words.length;
        
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                String w1 = words[i];
                String w2 = words[j];
                int l = w1.length();

                if (l != w2.length()) continue;
                
                for (int k = 1; k < l; k++) {
                    String A1 = w1.substring(0, k);
                    String B1 = w1.substring(k, l);
                    String A2 = w2.substring(0, l - k);
                    String B2 = w2.substring(l - k, l);
                    
                    if (A1.equals(B2) && B1.equals(A2)) {
                        cnt++;
                        break;
                    }
                }
            }
        }
        
        return cnt;
    }

}