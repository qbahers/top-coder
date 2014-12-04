public class InterestingNumber {

    public String isInteresting(String x) {
        char[] xx = x.toCharArray();
        int N = xx.length;
        
        int[] freq = new int[10];
        
        for (int i = 0; i < N; i++) {
            char c = xx[i];
            
            if (c == 'X') continue;
            
            int digit = Character.getNumericValue(c);
            if (i + digit + 1 >= xx.length || c != xx[i + digit + 1]  || freq[digit] >= 2) 
                return "Not interesting";
            
            xx[i + digit + 1] = 'X';
            freq[digit] += 2;
        }
         
        return "Interesting";  
    }

}