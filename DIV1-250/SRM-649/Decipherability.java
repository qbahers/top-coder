import java.util.*;

public class Decipherability {

    public String check(String s, int K) {
        int N = s.length();
        
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            char c = (char) ('a' + i);
            
            int start = -1;
            for (int j = 0; j < N; j++) {
                if (s.charAt(j) == c) {
                    if (start == -1) {
                        start = j;
                    }
                    else {
                        min = Math.min(min, j - start);
                        start = j;
                    }
                }
            }
        }
        
        return (N == K || min > K) ? "Certain" : "Uncertain"; 
    }
<%:testing-code%>
}
