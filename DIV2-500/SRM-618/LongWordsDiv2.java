import java.util.*;

public class LongWordsDiv2 {

    public String find(String word) {
        char[] w = word.toCharArray();
        int N    = w.length;
        
        char current = w[0];
        for (int i = 1; i < N; i++) {
            if (w[i] == current) return "Dislikes";
            current = w[i];
        }
        
        Map<Character, List<Integer>> indices = new HashMap<Character, List<Integer>>();
        for (int i = 0; i < N; i++) {
            if (indices.containsKey(w[i])) {
                List<Integer> l = indices.get(w[i]);
                l.add(i);
                indices.put(w[i], l); 
            }
            else {
                List<Integer> l = new ArrayList<Integer>();
                l.add(i);
                indices.put(w[i], l);
            }
        }
        
        for (Map.Entry<Character, List<Integer>> entry1 : indices.entrySet()) {
            for (Map.Entry<Character, List<Integer>> entry2 : indices.entrySet()) {
                List<Integer> l1 = entry1.getValue();
                List<Integer> l2 = entry2.getValue();
                int N1 = l1.size();
                int N2 = l2.size();
                
                if (N1 < 2 || N2 < 2) continue;
                int index1 = l1.get(0);
                int index4 = l2.get(N2 - 1);
                
                int index2 = -1; 
                for (int i = 0; i < N2 - 1; i++) {
                    if (l2.get(i) > index1) {
                        index2 = l2.get(i);
                        break;
                    }
                }
                
                int index3 = 100;
                for (int i = N1 - 1; i > 0; i--) {
                    if (l1.get(i) < index4) {
                        index3 = l1.get(i);
                        break;
                    }
                }
                
                if (index1 < index2 && index2 < index3 && index3 < index4) return "Dislikes";
            }   
        }
        
        return "Likes";
    }

}