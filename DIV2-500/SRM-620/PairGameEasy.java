import java.util.*;

public class PairGameEasy {
    private Set<Pair> pairs;
    
    public String able(int a, int b, int c, int d) {
        pairs = new HashSet<Pair>();
        generate(new Pair(a, b));
        
        return (pairs.contains(new Pair(c, d))) ? "Able to generate" : "Not able to generate";
    }
    
    private void generate(Pair pair) {
        pairs.add(pair);
        
        if (pair.x + pair.y <= 1000) {
            generate(new Pair(pair.x + pair.y, pair.y));
            generate(new Pair(pair.x, pair.x + pair.y));
        } 
    }
    
    public class Pair {
        private final int x;
        private final int y;
        
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
        
        public int hashCode() {
            return 31 * x + y;
        }

        public boolean equals(Object obj) {
           if (!(obj instanceof Pair))
                return false;
            if (obj == this)
                return true;
    
            Pair that = (Pair) obj;
            return this.x == that.x && this.y == that.y;
        }
    } 

}