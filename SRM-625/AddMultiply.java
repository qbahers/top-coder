public class AddMultiply {

    public int[] makeExpression(int y) {
        int[] x = new int[3];
        for (int i = -1000; i <= 1000; i++) {
            for (int j = -1000; j <= 1000; j++) {
                for (int k = -1000; k <= 1000; k++) {
                    if (((i * j) + k) == y) {
                        if ((i == 0) || (j == 0) || (k == 0) || (i == 1) || (j == 1) || (k == 1)) {
                            continue;
                        }
                        else {
                            x[0] = i;
                            x[1] = j;
                            x[2] = k;
                            return x;
                        }
                    }
                }
            }
        }
        return x;
    }

}
