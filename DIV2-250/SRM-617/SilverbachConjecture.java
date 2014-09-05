public class SilverbachConjecture {

    public int[] solve(int n) {
        if (n % 2 == 0) return new int[]{4, n - 4};
        return new int[]{9, n - 9};
    }

}
