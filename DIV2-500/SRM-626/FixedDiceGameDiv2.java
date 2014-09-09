import java.util.*;

public class FixedDiceGameDiv2 {

    public double getExpectation(int a, int b) {
        
        int sum = 0;
        int cnt = 0;
        for (int i = 1; i <= b; i++) {
            for (int j = i + 1; j <= a; j++) {
                sum += j;
                cnt++;
            }
        }
        
        return sum / (double) cnt;
    }

}