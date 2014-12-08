import java.util.*;

public class ShoppingSurveyDiv2 {

    public int minValue(int N, int[] s) {
        int M = s.length;
        
        int sum = 0;
        for (int i = 0; i < M; i++)
            sum += s[i];
        
        return Math.max(sum - N * (M - 1), 0);
    }

}