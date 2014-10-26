import java.util.*;

public class PrimalUnlicensedCreatures {

    public int maxWins(int initialLevel, int[] grezPower) {
        Arrays.sort(grezPower);
        
        int res = 0;
        for (int i = 0; i < grezPower.length; i++)
            if (initialLevel > grezPower[i]) {
                res++;
                initialLevel += grezPower[i] / 2;
            }
        
        return res;
    }

}