import java.util.*;

public class FoxAndMp3 {

    private int n;
    private List<String> songs = new ArrayList<String>();

    public String[] playList(int n) {
        this.n = n;

        for (int i = 1; i < 10; i++)
            dfs(String.valueOf(i));
        
        return songs.toArray(new String[songs.size()]);
    }
    
    private void dfs(String s) {
        if (Long.parseLong(s) > n || songs.size() >= Math.min(n, 50)) return;
        
        songs.add(s + ".mp3");
        
        for (int i = 0; i < 10; i++)
            dfs(s + i);
    }

}