import java.util.*;

public class LittleElephantAndBalls {

    public int getNumber(String S) {
        int[] a = new int[3];
        
        int res = 0;
        for (int i = 0; i < S.length() - 1; i++) {
            if (S.charAt(i) == 'R' && a[0] < 2) a[0]++;
            if (S.charAt(i) == 'G' && a[1] < 2) a[1]++;
            if (S.charAt(i) == 'B' && a[2] < 2) a[2]++;
            for (int k = 0; k < 3; k++) res += a[k];
        }
        
        return res;
    }

}