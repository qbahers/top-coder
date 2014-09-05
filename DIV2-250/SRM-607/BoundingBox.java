import java.util.*;

public class BoundingBox {

    public int smallestArea(int[] X, int[] Y) {
        Arrays.sort(X);
        Arrays.sort(Y);

        int N = X.length;

        return (X[N - 1] - X[0]) * (Y[N - 1] - Y[0]);
    }

}
