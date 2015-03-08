import java.util.*;

public class TheConsecutiveIntegersDivTwo {

    public int find(int[] numbers, int k) {
        if (k == 1) return 0;

        Arrays.sort(numbers);
        
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < numbers.length; i++) {
            int diff = Math.abs(numbers[i - 1] - numbers[i]);
            min = Math.min(min, diff);
        }
        
        return min - 1;
    }

}