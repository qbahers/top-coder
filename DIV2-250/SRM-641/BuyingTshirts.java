import java.util.*;

public class BuyingTshirts {

    public int meet(int T, int[] Q, int[] P) {
        int res = 0;
        
        int moneyQ = 0, moneyP = 0;
        for (int i = 0; i < Q.length; i++) {
            moneyQ += Q[i];
            moneyP += P[i];
            
            if (moneyQ >= T && moneyP >= T) res++;
            
            moneyQ %= T;
            moneyP %= T;
        }
        
        return res;
    }

}