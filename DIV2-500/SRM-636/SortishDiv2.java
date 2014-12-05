import java.util.*;

public class SortishDiv2 {

    public int ways(int sortedness, int[] seq) {
        int N = seq.length;
        
        List<Integer> missingElements = new ArrayList<Integer>();
        for (int i = 1; i <= N; i++)
            missingElements.add(i);

        for (int i = 0; i < N; i++) 
            missingElements.remove((Integer) seq[i]);

        int M = missingElements.size();

        Set<List<Integer>> permutations = new HashSet<List<Integer>>();
        List<Integer> emptyList = new ArrayList<Integer>();
        permutations.add(emptyList);

        for (int i = 0; i < M; i++) {
            Set<List<Integer>> p = new HashSet<List<Integer>>();
            for (List<Integer> l : permutations)
                for (int j = 0; j <= l.size(); j++) {
                    List<Integer> ll = new ArrayList<Integer>(l);
                    ll.add(j, missingElements.get(i));
                    p.add(ll);
                }
            permutations = new HashSet<List<Integer>>(p);
        }
        
        int res = 0;
        for (List<Integer> p : permutations) {
            int[] s = seq.clone();
            
            for (int i = 0; i < N; i++)
                if (s[i] == 0) s[i] = p.remove(0);
            
            int count = 0;
            for (int i = 0; i < N; i++)
                for (int j = i + 1; j < N; j++)
                    if (s[i] < s[j]) count++;
            
            if (count == sortedness) res++;
        }

        return res;
    }

}