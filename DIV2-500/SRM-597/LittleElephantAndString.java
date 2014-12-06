import java.util.*;

public class LittleElephantAndString {

    public int getNumber(String A, String B) {
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();
        int N = a.length;
        
        if (!areAnagrams(a, b)) return -1;
        
        int res = 0;
        
        int i = N - 1, j = N - 1;
        while (i >= 0) {
            if (a[i] == b[j]) {
                i--;
                j--;
            }
            else {
                i--;
                res++;
            }
        }
        
        return res;
    }

    private boolean areAnagrams(char[] a, char[] b) {
        char[] c = a.clone();
        char[] d = b.clone();
        
        Arrays.sort(c);
        Arrays.sort(d);
        
        String C = new String(c);
        String D = new String(d);
        
        return C.equals(D);
    }

}