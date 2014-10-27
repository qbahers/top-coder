import java.util.*;

public class DeerInZooDivTwo {

    public int[] getminmax(int N, int K) {
        return new int[]{Math.max(0, N - K), N - (K + 1) / 2};
    }

}