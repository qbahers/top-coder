import java.util.*;

public class TomekPhone {

    public int minKeystrokes(int[] frequencies, int[] keySizes) {
        int N = frequencies.length;
        
        List<Integer> l = new ArrayList<Integer>();
        for (int k = 1; k <= 50; k++)
            for (Integer keySize : keySizes)
                if (keySize >= k) l.add(k);
        
        if (l.size() < N) return -1;
        
        Arrays.sort(frequencies);
        
        int res = 0;
        for (int i = 0; i < N; i++)
            res += frequencies[N - 1 - i] * l.get(i);
        
        return res;
    }

}