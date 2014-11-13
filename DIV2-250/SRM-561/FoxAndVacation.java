import java.util.*;

public class FoxAndVacation {

    public int maxCities(int total, int[] d) {
        Arrays.sort(d);
        
        int k = 0;
        int count = 0;
        while (k < d.length && (count + d[k]) <= total) {
            count += d[k];
            k++;
        }
        
        return k;
    }

}