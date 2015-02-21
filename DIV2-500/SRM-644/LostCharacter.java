import java.util.*;

public class LostCharacter {

    public int[] getmins(String[] str) {
        int N = str.length;
        
        int[] res = new int[N];
        Arrays.fill(res, N - 1);
        
        for (int k = 0; k < N; k++) {
            List<Word> words = new ArrayList<Word>();
        
            for (int i = 0; i < N; i++) {
                String s = (i == k) ? str[i].replace('?', 'a') : str[i].replace('?', 'z');
                Word w = new Word(s, i);
                words.add(w);
            }
            
            Collections.sort(words);
            
            List<String> wrds = new ArrayList<String>();
            for (Word word : words) wrds.add(word.characters);
            
            for (int i = 0; i < N; i++) {
                String w = words.get(i).characters;
                if (wrds.indexOf(w) < res[words.get(i).originalPos])
                    res[words.get(i).originalPos] = wrds.indexOf(w);
            }
        }
        
        return res;
    }
    
    class Word implements Comparable<Word> {
        String characters;
        int originalPos;
        
        public Word(String characters, int originalPos) {
            this.characters = characters;
            this.originalPos = originalPos;
        }
        
        @Override
        public int compareTo(Word that) {
            return this.characters.compareTo(that.characters);
        }       
    }

}