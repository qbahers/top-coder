import java.util.*;

public class TrafficCongestionDivTwo {

    public long theMinCars(int treeHeight) {
        if (treeHeight == 0 || treeHeight == 1) return 1;
        else {
            long u = 1, v = 1, w = 0;
            while (treeHeight > 1) {
                w = v + 2 * u;
                u = v;
                v = w;
                treeHeight--;
            }
            return w;
        }
    }

}