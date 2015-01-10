import java.util.*;

public class ColorfulChocolates {

    public int maximumSpread(String chocolates, int maxSwaps) {
        String colors = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int N = chocolates.length();
        
        int res = 0;
        for (int k = 0; k < 26; k++) {
            char color = colors.charAt(k);
            int nbSwaps = -1;
            int spread = 0;
            while (nbSwaps <= maxSwaps) {
                spread++;
                nbSwaps = Integer.MAX_VALUE;
                for (int j = 0; j < N; j++) {
                    int nbS = 0;
                    int count = 0;
                    int start = -1;
                    int end = -1;
                    for (int i = j; i < N; i++)
                        if (chocolates.charAt(i) == color) {
                            count++;
                            if (count == 1)      start = i;
                            if (count == spread) end = i;
                        }
                    
                    if (start == -1 || end == -1) nbS = Integer.MAX_VALUE;
                    else {
                        StringBuilder s = new StringBuilder(chocolates.substring(start, end + 1));
                        int cnt = 0;
                        while (s.length() > spread) {
                            int index = -1;
                            int min = Integer.MAX_VALUE;
                            for (int i = 0; i < s.length(); i++) {
                                int m = Math.min(i, s.length() - 1 - i);
                                
                                if (s.charAt(i) != color && m < min) {
                                    min = m;
                                    index = i;
                                }
                            }
                            cnt += min;
                            s.deleteCharAt(index);
                        }
                        nbS = cnt;
                    }
                    nbSwaps = Math.min(nbSwaps, nbS);
                }
            }
            res = Math.max(res, spread - 1);
        }
        
        return res;
    }

}