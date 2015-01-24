import java.util.*;

public class IncrementAndDoubling {

    public int getMin(int[] desiredArray) {
        int N = desiredArray.length;

        int sum = 0;
        for (int x : desiredArray) sum += x;
        
        int res = 0;
        while (sum != 0) {
            sum = 0;
            for (int i = 0; i < N; i++) {
                sum += desiredArray[i];
                if (desiredArray[i] % 2 != 0) {
                    desiredArray[i]--;
                    res++;
                }
            }

            if (sum == 0) return res - 1;
            
            for (int i = 0; i < N; i++) desiredArray[i] /= 2;
            res++;
        }
        
        return 0;
    }

}