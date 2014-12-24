import java.util.*;

public class TheNumberGameDivTwo {

    public String find(int n) {
        int count = 0;
        
        int d = 0;
        while (d != -1) {
            n -= d;
            count++;

            d = -1;
            for (int k = 2; k < n; k++)
                if (n % k == 0) {
                    d = k;
                    if (d % 2 != 0) break;
                }
        }
        
        return ((count - 1) % 2 == 0) ? "Brus" : "John";
    }

}