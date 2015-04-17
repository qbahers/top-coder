import java.util.*;

public class KitayutaMart2 {

    public int numBought(int K, int T) {
        int price = K;
        int res = 1;

        while (price < T) {
            K *= 2;
            price += K;
            res++;
        }
        
        return res;
    }
    
}