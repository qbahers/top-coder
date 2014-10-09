import java.util.*;

public class LittleElephantAndDouble {

    public String getAnswer(int[] A) {
        int N = A.length;
        
        Arrays.sort(A);
        int max = A[N - 1];
        
        for (int i = 0; i < N; i++) {
            while (A[i] < max) A[i] *= 2;
            if (A[i] != max) return "NO";
        }
        
        return "YES";
    }

}