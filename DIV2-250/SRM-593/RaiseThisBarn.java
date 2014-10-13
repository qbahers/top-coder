import java.util.*;

public class RaiseThisBarn {

    public int calc(String str) {
        int N = str.length();
        
        int cntC = 0;
        for (int i = 0; i < N; i++)
            if (str.charAt(i) == 'c') cntC++;
        
        if (cntC % 2 != 0) return 0;
        if (cntC == 0) return N - 1;
        
        int cnt = 0;
        int i = 0;
        while (cnt < cntC / 2) {
            if (str.charAt(i) == 'c') cnt++;
            i++;
        }
        
        int res = 1;
        while (str.charAt(i) != 'c') {
            res++;
            i++;
        }
        
        return res; 
    }
    
}