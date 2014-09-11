import java.util.*;

public class BoxesDiv2 {

    public int findSize(int[] candyCounts) {
        LinkedList<Integer> boxes = new LinkedList<Integer>();
        
        for (int i = 0; i < candyCounts.length; i++)
            boxes.add(candyCounts[i]);
            
        while (boxes.size() >= 2) {
            Collections.sort(boxes);            
            int first = boxes.poll();
            int second = boxes.poll();
            int largerBox = 2 * computeSize(Math.max(first, second));
            boxes.add(largerBox);
        }
        
        int outerBox = computeSize(boxes.poll());
        return outerBox;
    }
    
    private static int computeSize(int e) {
        int res = 1;
        while (e > res) {
            res *= 2;
        }
        return res;
    }

}