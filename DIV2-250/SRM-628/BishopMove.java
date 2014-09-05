public class BishopMove {

    public int howManyMoves(int r1, int c1, int r2, int c2) {
        if (((r1 + c1) % 2) != ((r2 + c2) % 2)) {
            return -1;
        }
        else {
            if (Math.abs(r2 - r1) == Math.abs(c2 - c1)) {
                if ((r1 == r2) && (c1 == c2)) {
                    return 0;
                }
                else {
                    return 1;
                }
            }
            else {
                return 2;
            }
        }
    }

}
