public class InterestingNumber {

    public String isInteresting(String x) {
        if (x.length() % 2 != 0) return "Not interesting";

        int[] a = new int[10];
        char[] x1 = x.toCharArray();
        for (int i = 0; i < x1.length; i++) {
            char c = x1[i];
            if (c == 'X') continue;

            int digit = Character.getNumericValue(c);
            if (a[digit] == 1) return "Not interesting";
            if (c != x1[i + digit + 1]) return "Not interesting";
            x1[i + digit + 1] = 'X'; 
        }
        return "Interesting";
    }

}
