import java.util.*;

public class LISNumberDivTwo {

    public int calculate(int[] seq) {
        int res = 1;
        
        for (int i = 1; i < seq.length; i++)
            if (seq[i] <= seq[i - 1]) res++;
        
        return res;
    }

}