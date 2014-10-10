import java.util.*;

public class FoxAndSightseeing {

    public int getMin(int[] position) {
        int N = position.length;
        
        int sum = 0;
        for (int i = 1; i < N; i++)
            sum += Math.abs(position[i] - position[i - 1]);
        
        int min = sum;
        for (int i = 1; i < N - 1; i++)
            min = Math.min(min, sum - Math.abs(position[i]     - position[i - 1])
                                    - Math.abs(position[i + 1] - position[i])
                                    + Math.abs(position[i + 1] - position[i - 1]));

        return min;
    }

}