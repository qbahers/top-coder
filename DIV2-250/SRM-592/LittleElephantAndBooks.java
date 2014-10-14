import java.util.*;

public class LittleElephantAndBooks {

    public int getNumber(int[] pages, int number) {
        Arrays.sort(pages);
        
        int sum = 0;
        for (int i = 0; i < number - 1; i++)
            sum += pages[i];
            
        return sum + pages[number];
    }

}