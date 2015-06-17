import java.util.*;

public class ConvertibleStrings {
    private List<String> permutations = new ArrayList<String>();

    public int leastRemovals(String A, String B) {
        char[] b = B.toCharArray();
        int N = b.length;
        
        String s = "";
        for (int i = 0; i < 9; i++)
            s += "" + i;

        computePermutations(s);

        int min = N;
        for (String p : permutations) {
            char[] a = A.toCharArray();

            for (int i = 0; i < N; i++) {
                int k = '8' - p.charAt(a[i] - 'A');
                a[i] = (char) (k + (int) 'A');
            }

            int count = 0;
            for (int i = 0; i < N; i++) {
                if (a[i] != b[i]) {
                    count++;
                }
            }

            min = Math.min(min, count);
        }

        return min;
    }

    private void computePermutations(String s) { computePermutations("", s); }
    
    private void computePermutations(String prefix, String s) {
        int N = s.length();
        if (N == 0) permutations.add(prefix);
        else {
            for (int i = 0; i < N; i++)
                computePermutations(prefix + s.charAt(i), s.substring(0, i) + s.substring(i + 1, N));
        }
    }

}