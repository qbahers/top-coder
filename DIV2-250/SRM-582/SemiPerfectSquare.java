import java.util.*;

public class SemiPerfectSquare {

    public String check(int N) {
        for (int a = 1; a <= N; a++) {
            for (int b = a + 1; b <= N; b++) {
                if (a * b * b == N) return "Yes";
                if (a * b * b >  N) break;
            }
        }
        
        return "No";
    }

}