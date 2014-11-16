import java.util.*;

public class GreatFairyWar {

    public int minHP(int[] dps, int[] hp) {
        int N = dps.length;

        int res = 0;
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = i; j < N; j++)
                count += dps[j];
            
            res += hp[i] * count;
        }
        
        return res;
    }

}