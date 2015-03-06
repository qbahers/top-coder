import java.util.*;

public class BacteriesColony {

    public int[] performTheExperiment(int[] c) {
        int N = c.length;
        
        while (true) {
            int[] aux = c.clone();
            for (int i = 1; i < N - 1; i++) {
                if (c[i] > Math.max(c[i - 1], c[i + 1])) aux[i] = c[i] - 1;
                if (c[i] < Math.min(c[i - 1], c[i + 1])) aux[i] = c[i] + 1;
            }
            if (Arrays.equals(c, aux)) break;
            c = aux;
        }
        
        return c;
    }

}
