import java.util.*;

public class PenguinTiles {

    public int minMoves(String[] tiles) {
        int H = tiles.length;
        int W = tiles[0].length();
        
        for (int i = 0; i < H; i++)
            for (int j = 0; j < W; j++)
                if (tiles[i].charAt(j) == '.') {
                    if      (i == H - 1 && j == W - 1)      return 0;
                    else if (i == H - 1 || j == W - 1)      return 1;
                    else                                    return 2;
                }
        
        return -1;
    }

}