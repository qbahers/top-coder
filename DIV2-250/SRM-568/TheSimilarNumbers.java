import java.util.*;

public class TheSimilarNumbers {

    public int find(int lower, int upper) {
        int cur = lower;
        int res = 1;
        
        while (cur * 10 + 1 <= upper) {
            cur = cur * 10 + 1;
            res++;
        }
        
        return res;
    }

}