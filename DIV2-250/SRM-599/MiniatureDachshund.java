import java.util.*;

public class MiniatureDachshund {

    public int maxMikan(int[] mikan, int weight) {
        Arrays.sort(mikan);
        
        int cnt = 0;
        for (int i = 0; i < mikan.length; i++) {
            if (weight + mikan[i] <= 5000) {
                weight += mikan[i];
                cnt++;
            }
            else break;
        }
        
        return cnt;
    }

}