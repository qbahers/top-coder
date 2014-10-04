import java.util.*;

public class TheShuttles {

    public int getLeastCost(int[] cnt, int baseCost, int seatCost) {
        int min = Integer.MAX_VALUE;
        
        for (int x = 1; x <= 100; x++) {
            int cost = 0;
            for (int i = 0; i < cnt.length; i++)
                cost += Math.ceil(cnt[i] / (double) x) * (baseCost + x * seatCost);
            if (cost < min) min = cost;
        }
        
        return min;
    }

}