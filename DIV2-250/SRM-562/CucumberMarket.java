import java.util.*;

public class CucumberMarket {

    public String check(int[] price, int budget, int k) {
        Arrays.sort(price);
        
        int count = 0;
        for (int i = 0; i < k; i++)
            count += price[price.length - 1 - i];
        
        return (count <= budget) ? "YES" : "NO";
    }

}