import java.util.*;

public class ValueHistogram {

    public String[] build(int[] values) {
        int[] freq = new int[10];
        for (int x : values) freq[x]++;
        
        int H = 0;
        for (int x : freq) H = Math.max(H, x);
        
        String[] res = new String[H + 1];
        Arrays.fill(res, "");
        
        for (int i = 0; i <= H; i++)
            for (int j = 0; j <= 9; j++)
                res[H - i] += (i < freq[j]) ? 'X' : '.';
        
        return res;
    }

}