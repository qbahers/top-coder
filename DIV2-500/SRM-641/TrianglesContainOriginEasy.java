import java.util.*;

public class TrianglesContainOriginEasy {
    private int[] x;
    private int[] y;

    public int count(int[] x, int[] y) {
        this.x = x;
        this.y = y;
        
        int N = x.length;
        
        int res = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if (i != j && i != k && j != k) {
                        int[] v0 = new int[]{x[i], y[i]};
                        int[] v1 = new int[]{x[j] - x[i], y[j] - y[i]};
                        int[] v2 = new int[]{x[k] - x[i], y[k] - y[i]};
                        
                        double a = - det(v0, v2) / det(v1, v2);
                        double b = det(v0, v1) / det(v1, v2);
                        
                        if (a > 0 && b > 0 && a + b < 1) res++;     
                    }
                }
            }
        }
        
        return res / 6;
    }
    
    private double det(int[] u, int[] v) {
        return u[0] * v[1] - u[1] * v[0];
    }

}