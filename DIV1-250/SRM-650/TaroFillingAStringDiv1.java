import java.util.*;

public class TaroFillingAStringDiv1 {
    private static final long MOD = (long) (1e9 + 7);

    public int getNumber(int N, int[] position, String value) {
        int M = position.length;
    
        Charac[] c = new Charac[M];
    
        for (int i = 0; i < M; i++) {
            c[i] = new Charac(position[i], value.charAt(i));
        }
        
        Arrays.sort(c);
        
        long res = 1;
        for (int i = 1; i < M; i++) {
            int diff = c[i].position - c[i - 1].position;
            if (diff % 2 == 0 && c[i].value != c[i - 1].value) {
                res = (res * diff) % MOD;
            }
            else if (diff % 2 != 0 && c[i].value == c[i - 1].value) {
                res = (res * diff) % MOD;
            }
        }
        
        return (int) res; 
    }
    
    class Charac implements Comparable<Charac>{
        int position;
        char value;
        
        public Charac(int position, char value) {
            this.position = position;
            this.value = value;
        }
        
        @Override
        public int compareTo(Charac that) {
            return this.position > that.position ? 1 : this.position == that.position ? 0 : -1;
        }  
    }

}
