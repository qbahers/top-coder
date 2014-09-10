import java.util.*;

public class IncrementingSequence {

    public String canItBeDone(int k, int[] A) {
        int N = A.length;
        List<SortedSet<Integer>> l = new ArrayList<SortedSet<Integer>>();
        for (int i = 0; i < N; i++) {
            SortedSet<Integer> set = new TreeSet<Integer>();
            l.add(set);
        }
        
        for (int i = 0; i < N; i++) {
            int j = 0;
            while (A[i] + j * k <= N) {
                l.get(A[i] + j * k - 1).add(i);
                j++;
            }
        }
        
        if (f(l)) {
            return "POSSIBLE";
        }
        else {
            return "IMPOSSIBLE";
        }
    }
    
    private static boolean f(List<SortedSet<Integer>> l) {
        Collections.sort(l, new SetSizeComparator());
                
        for (SortedSet<Integer> e : l) {
            if (e.size() == 0) {
                return false;
            }
            else if (e.size() == 1) {
                int tmp = e.first();
                for (SortedSet<Integer> f : l) {
                    f.remove(tmp);
                }
                e.add(tmp);
            }
            else {
                int tmp = e.first();
                e.clear();
                e.add(tmp);
                f(l);
            }   
        }
        
        return true;
    }

}

class SetSizeComparator implements Comparator<SortedSet<Integer>> {
    @Override
    public int compare(SortedSet<Integer> s1, SortedSet<Integer> s2) {
        return s1.size() < s2.size() ? -1 : s1.size() == s2.size() ? 0 : 1;
    }
}
