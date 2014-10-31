import java.util.*;

public class CityMap {

    public String getLegend(String[] cityMap, int[] POIs) {
        int H = cityMap.length;
        int W = cityMap[0].length();
        
        int[] freq = new int[26];
        
        for (int i = 0; i < H; i++)
            for (int j = 0; j < W; j++) {
                int c = cityMap[i].charAt(j);
                if (c != '.') freq[c - 'A']++;
            }
        
        String res = "";
        
        for (int i = 0; i < POIs.length; i++)
            for (int j = 0; j < 26; j++)
                if (POIs[i] == freq[j]) res += (char)('A' + j);
        
        return res;
    }

}