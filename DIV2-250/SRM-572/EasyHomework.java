import java.util.*;

public class EasyHomework {

    public String determineSign(int[] A) {
        int count = 0;
        
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) return "ZERO";
            if (A[i] < 0) count++;
        }
        
        return (count % 2 == 0) ? "POSITIVE" : "NEGATIVE";
    }

}