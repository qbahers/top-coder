import java.util.*;

public class DivideByZero {

    public int CountNumbers(int[] numbers) {
        List<Integer> l = new ArrayList<Integer>();

        for (int n : numbers) {
            l.add(n);
        }
        Collections.sort(l);
        
        int res = 0;
        do {
            res = l.size();
            for (int i = res - 1; i > 0; i--) {
                for (int j = i - 1; j >= 0; j--) {
                    int A = l.get(i);
                    int B = l.get(j);
                    int C = A / B;
                    if (!l.contains(C)) l.add(C);
                }
            }
            Collections.sort(l);
        } while (l.size() != res);

        return res;
    }

}
