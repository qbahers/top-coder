import java.util.*;

public class WinterAndCandies {

    public int getNumber(int[] type) {
        int[] freq = new int[51];
        
        Arrays.sort(type);
        
        int k = 0;
        for (int i = 0; i < type.length; i++) {
            freq[type[i]]++;
            
            if (type[i] == k) continue;
            if (type[i] == k + 1) {
                k++;
            }
            else {
                break;
            }
        }
        
        int res = 0;
        int nbWays = 1;
        for (int i = 1; i <= k; i++) {
            nbWays *= freq[i]; 
            res += nbWays; 
        }
        
        return res;
    }

}