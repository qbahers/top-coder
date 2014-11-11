import java.util.*;

public class FoxAndHandleEasy {

    public String isPossible(String S, String T) {
        Set<String> set = new HashSet<String>();
        
        int N = S.length();
        for (int i = 0; i < N; i++)
            set.add(S.substring(0, i) + S + S.substring(i, N));
        
        return (set.contains(T)) ? "Yes" : "No"; 
    }

}