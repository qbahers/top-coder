import java.util.*;

public class TaroJiroDividing {

    public int getNumber(int A, int B) {
        int max = Math.max(A, B);
        int min = Math.min(A, B);
        
        while (max > min) {
            if (max % 2 != 0) return 0;
            else              max /= 2;
        }
        
        if (max == min) {
            int count = 1;
        
            while (max % 2 == 0) {
                max /= 2;
                count++;
            }
            
            return count;
        }
        else return 0;
    }

}