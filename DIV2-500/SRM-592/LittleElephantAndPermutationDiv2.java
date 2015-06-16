import java.util.*;

public class LittleElephantAndPermutationDiv2 {
    private long count = 0;
    private int N;
    private int K;

    public long getNumber(int N, int K) {
        this.N = N;
        this.K = K;
    
        String s = "";
        for (int i = 0; i < N; i++)
            s += "" + i;

        perm(s);
        
        for (int i = 1; i <= N; i++)
            count *= i;

        return count;
    }

    public void perm(String s) {
       int N = s.length();
       char[] a = new char[N];
       for (int i = 0; i < N; i++)
           a[i] = s.charAt(i);
       perm(a, N);
    }

    private void perm(char[] a, int n) {
        if (n == 1) {
            int sum = 0;
            for (int i = 0; i < N; i++) {
                sum += Math.max(i, a[i] - '0') + 1;
            }
            if (sum >= K) {
                count++;
            }
            return;
        }
        for (int i = 0; i < n; i++) {
            swap(a, i, n-1);
            perm(a, n-1);
            swap(a, i, n-1);
        }
    }  

    private void swap(char[] a, int i, int j) {
        char c;
        c = a[i]; a[i] = a[j]; a[j] = c;
    }

}