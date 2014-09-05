public class RectangleCoveringEasy {
    
    public int solve(int holeH, int holeW, int boardH, int boardW) {
         if (cover(holeH, holeW, boardH, boardW) || cover(holeH, holeW, boardW, boardH)) {
            return 1;
         }
         else {
            return -1;
        }
    }

    private static boolean cover(int holeH, int holeW, int boardH, int boardW) {
        return ((boardH >= holeH) && (boardW >= holeW) && !((boardH == holeH) && (boardW == holeW)));
    }

}
