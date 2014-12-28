import java.util.*;

public class FoxAndMp3Easy {

    public String[] playList(int n) {
        String[] a = new String[n];
        
        for (int i = 1; i <= n; i++)
            a[i - 1] = "" + i + ".mp3";
            
        Arrays.sort(a);
        
        return (n > 50) ? Arrays.copyOfRange(a, 0, 50) : a;
    }

}