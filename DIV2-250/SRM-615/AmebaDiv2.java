public class AmebaDiv2 {

    public int simulate(int[] X, int A) {
        for (int i = 0; i < X.length; i++) {
            if (X[i] == A) A *= 2;
        }
        return A;
    }

}
