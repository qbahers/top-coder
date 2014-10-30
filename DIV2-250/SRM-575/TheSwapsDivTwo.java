import java.util.*;

public class TheSwapsDivTwo {

    public int find(int[] sequence) {
        int N = sequence.length;
        Set<List<Integer>> s = new HashSet<List<Integer>>();
        
        for (int i = 0; i < N; i++)
            for (int j = i + 1; j < N; j++) {
                List<Integer> seq = new ArrayList<Integer>();
                for (int element : sequence)
                    seq.add(element);
                
                Integer tmp = seq.get(i);
                seq.set(i, seq.get(j));
                seq.set(j, tmp);
                
                s.add(seq);
            }
        
        return s.size();
    }

}