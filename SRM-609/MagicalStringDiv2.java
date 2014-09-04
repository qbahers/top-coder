public class MagicalStringDiv2 {

    public int minimalMoves(String S) {
        int N = S.length();

        int res = 0;
        for (int i = 0; i < N / 2; i++) {
            if (S.charAt(i) == '<') res++;
        }

        for (int i = N / 2; i < N; i++) {
            if (S.charAt(i) == '>') res++;
        }

        return res;
    }

}
