import java.util.*;

public class NarrowPassage2Easy {

    public int count(int[] size, int maxSizeSum) {
        int N = size.length;
        
        Set<List<Wolf>> permutations = new HashSet<List<Wolf>>();
        
        List<Wolf> wolves = new ArrayList<Wolf>();
        for (int i = 0; i < N; i++)
            wolves.add(new Wolf(i, size[i]));
        
        permutations.add(wolves);
        
        int nbPermutationsFound = 0;
        while (permutations.size() > nbPermutationsFound) {
            nbPermutationsFound = permutations.size();
            
            Set<List<Wolf>> newPermutations = new HashSet<List<Wolf>>();
            for (List<Wolf> l : permutations)
                for (int i = 1; i < l.size(); i++)
                    if (l.get(i - 1).size + l.get(i).size <= maxSizeSum) {
                        Wolf[] a = l.toArray(new Wolf[l.size()]);
                        Wolf tmp = a[i - 1];
                        a[i - 1] = a[i];
                        a[i]     = tmp;
                        newPermutations.add(Arrays.asList(a));
                    }

            permutations.addAll(newPermutations);
        }
        
        return permutations.size();
    }
    
    public class Wolf {
        private final int id;
        private final int size;
        
        public Wolf(int id, int size) {
            this.id   = id;
            this.size = size;
        }
        
        public int hashCode() {
            return 31 * id + size;
        }
        
        public boolean equals(Object obj) {
            if (!(obj instanceof Wolf)) return false;
            if (obj == this)            return true;
            Wolf that = (Wolf) obj;
            return this.id == that.id && this.size == that.size;
        }
    }

}