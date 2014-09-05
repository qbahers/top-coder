public class ManySquares {

    public int howManySquares(int [] sticks) {
        int[] nbSticks = new int[1001];

        for (int stick : sticks) {
            nbSticks[stick]++;
        }

        int max = 0;
        for (int i = 1; i <= 1000; i++) {
            max += nbSticks[i] / 4;
        }
        return max;
    }

}
