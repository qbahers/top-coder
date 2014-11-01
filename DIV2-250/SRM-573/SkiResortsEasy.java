import java.util.*;

public class SkiResortsEasy {

    public int minCost(int[] altitude) {
        int res = 0;
        
        for (int i = 1; i < altitude.length; i++) {
            int diff = altitude[i] - altitude[i - 1];
            if (diff > 0) {
                res += diff;
                altitude[i] = altitude[i - 1];
            }
        }
        
        return res;
    }

}