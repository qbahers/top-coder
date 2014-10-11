import java.util.*;

public class LittleElephantAndBallsAgain {

    public int getNumber(String S) {
        int N = S.length();
        
        int cnt = 1;
        int max = 1;
        for (int i = 1; i < N; i++) {
            if (S.charAt(i) == S.charAt(i - 1)) {
                cnt++;
                max = Math.max(max, cnt);
            }
            else cnt = 1;
        }
        
        return N - max;
    }

}