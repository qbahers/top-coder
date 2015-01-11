import java.util.*;

public class BlockTower {

    public int getTallest(int[] blockHeights) {
        int N = blockHeights.length;

        int res = 0;
        for (int i = 0; i < N; i++) {
            int hOdd = 0;
            int hEven = 0;
            for (int j = 0; j < N; j++) {
                if (j <= i && (blockHeights[j] % 2) == 0) hEven += blockHeights[j];
                if (j >= i && (blockHeights[j] % 2) == 1) hOdd  += blockHeights[j];
            }
            res = Math.max(res, hEven + hOdd);
            res = Math.max(res, hEven);
        }
        
        return res;
    }

}