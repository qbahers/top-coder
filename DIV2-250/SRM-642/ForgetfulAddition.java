import java.util.*;

public class ForgetfulAddition {

    public int minNumber(String expression) {
        int N = expression.length();
        
        int res = Integer.MAX_VALUE;
        for (int i = 1; i < N; i++) {
            int a = Integer.parseInt(expression.substring(0, i));
            int b = Integer.parseInt(expression.substring(i));
            res = Math.min(res, a + b);
        }
        
        return res;
    }

}