public class LeftAndRightHandedDiv2 {

    public int count(String S) {
        int res = 0;
        for (int i = 0; i + 1 < S.length(); i++) {
            if (S.substring(i, i + 2).equals("RL")) res++;
        }
        return res;
    }

}
