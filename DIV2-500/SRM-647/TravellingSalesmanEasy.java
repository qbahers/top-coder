import java.util.*;

public class TravellingSalesmanEasy {

    public int getMaxProfit(int M, int[] profit, int[] city, int[] visit) {
        List<PriorityQueue<Integer>> list = new ArrayList<PriorityQueue<Integer>>();
        
        for (int i = 0; i <= M; i++)
            list.add(new PriorityQueue<Integer>(100, Collections.reverseOrder()));
        
        for (int i = 0; i < city.length; i++)
            list.get(city[i]).add(profit[i]);
        
        int res = 0;
        for (int i = 0; i < visit.length; i++) {
            PriorityQueue<Integer> maxPQ = list.get(visit[i]);
            
            if (!maxPQ.isEmpty()) res += maxPQ.poll();
        }
        
        return res;
    }

}