public class WritingWords {

    public int write(String word) {
        int ans = 0;

        for (int i = 0; i < word.length(); i++) {
            ans += Character.getNumericValue(word.charAt(i)) - Character.getNumericValue('A') + 1;
        }
        return ans;
    }

}
