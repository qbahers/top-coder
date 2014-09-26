import java.util.*;

public class CatsOnTheLineDiv2 {

    public String getAnswer(int[] position, int[] count, int time) {
        int N = position.length;

        Location[] locations = new Location[N];

        for (int i = 0; i < N; i++)
            locations[i] = new Location(position[i], count[i]);

        Arrays.sort(locations);

        int[] a = new int[4001];
        for (int i = 0; i < N; i++) {
            for (int k = locations[i].position - time; k <= locations[i].position + time; k++) {
                if (locations[i].count == 0) break;
                if ((k + 2000 >= 0) && (k + 2000 < 4001) && (a[k + 2000] == 0)) {
                    a[k + 2000] = 1; 
                    locations[i].count--;
                }
            }
        }

        int cnt = 0;
        for (Location l : locations)
            cnt += l.count;

        if (cnt == 0) return "Possible";
        return "Impossible";
    }
    
    class Location implements Comparable<Location> {
        int position;
        int count;
        
        public Location(int position, int count) {
            this.position = position;
            this.count = count;
        }

        @Override
        public int compareTo(Location that) {
            return this.position > that.position ? 1 : this.position == that.position ? 0 : -1;
        }           
    }

}