import java.util.*;

public class TrafficCongestion {
    private static final int MOD = (int) 1e9 + 7;

    public int theMinCars(int treeHeight) {
        if (treeHeight == 0 || treeHeight == 1) return 1;
        else {
            int u = 1, v = 1, w = 0;
            while (treeHeight > 1) {
                w = (v + (2 * u) % MOD) % MOD;
                u = v;
                v = w;
                treeHeight--;
            }
            return w;
        }
    }

}