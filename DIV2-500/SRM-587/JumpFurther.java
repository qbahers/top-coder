import java.util.*;

public class JumpFurther {

    public int furthest(int N, int badStep) {
        int res = 0;
        
        for (int i = 1; i <= N; i++) {
            res += i;
            if (res == badStep) res--;
        }
        
        return res;
    }

}