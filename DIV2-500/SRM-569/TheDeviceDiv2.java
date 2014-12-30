import java.util.*;

public class TheDeviceDiv2 {

    public String identify(String[] plates) {
        int M = plates.length;
        int N = plates[0].length();
    
        for (int j = 0; j < N; j++) {
            int[] freq = new int[2];
            
            for(int i = 0; i < M; i++)
                freq[plates[i].charAt(j) - '0']++;
            
            if (freq[0] < 1 || freq[1] < 2) return "NO";
        }
        
        return "YES";
    }

}