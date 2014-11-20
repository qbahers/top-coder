import java.util.*;

public class FoxAndFlowerShopDivTwo {
    private String[] flowers;

    public int theMaxFlowers(String[] flowers, int r, int c) {
        this.flowers = flowers;
        
        int R = flowers.length;
        int C = flowers[0].length();

        int res = 0;
        res = Math.max(res, count(0, r, 0, C));
        res = Math.max(res, count(r + 1, R, 0, C));
        res = Math.max(res, count(0, R, 0, c));
        res = Math.max(res, count(0, R, c + 1, C));
        
        return res;
    }
    
    private int count(int r1, int r2, int c1, int c2) {
        int cnt = 0;

        for (int i = r1; i < r2; i++)
            for (int j = c1; j < c2; j++)
                if (flowers[i].charAt(j) == 'F') cnt++;
        
        return cnt;
    }

}