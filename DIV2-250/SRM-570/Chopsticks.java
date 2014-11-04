import java.util.*;

public class Chopsticks {

    public int getmax(int[] length) {
    
        int[] count = new int[101];
        for (int x : length) count[x]++;
        
        int res = 0;
        for (int x : count) res += x / 2;
        
        return res;
    }

}