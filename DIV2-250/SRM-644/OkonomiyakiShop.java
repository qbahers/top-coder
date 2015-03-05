import java.util.*;

public class OkonomiyakiShop {

    public int count(int[] osize, int K) {
        int N = osize.length;
        
        int res = 0;
        for (int i = 0; i < N; i++)
            for (int j = i + 1; j < N; j++)
                if (Math.abs(osize[i] - osize[j]) <= K) res++;
                
        return res;
    }

}
