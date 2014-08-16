public class DoubleLetter {
    public static String ableToSolve(String S) {
        StringBuilder formerString;
        StringBuilder s = new StringBuilder(S);

        do {
            formerString = new StringBuilder(s);

            char formerChar = 'X';
            char currentChar = 'X';

            for (int i = 0; i < s.length(); i++) {
                currentChar = s.charAt(i);
                if (currentChar == formerChar) {
                    s.delete(i - 1, i + 1);
                    formerChar = 'X';
                }
                else {
                    formerChar = currentChar;
                }
            }
        } while (!s.toString().equals(formerString.toString()));
        
        if (s.toString().equals("")) {
            return "Possible";
        }
        else {
            return "Impossible";
        }
    }

    public static void main(String[] args) {
        System.out.println(ableToSolve("aabccb"));
        System.out.println(ableToSolve("aabccbb"));
        System.out.println(ableToSolve("abcddcba"));
        System.out.println(ableToSolve("abab"));
        System.out.println(ableToSolve("aaaaaaaaaa"));
        System.out.println(ableToSolve("aababbabbaba"));
        System.out.println(ableToSolve("zzxzxxzxxzzx"));
    }
}