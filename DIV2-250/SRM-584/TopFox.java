import java.util.*;

public class TopFox {

    public int possibleHandles(String familyName, String givenName) {
        Set<String> handles = new HashSet<String>();
        
        for (int i = 0; i < familyName.length(); i++) {
            String s = familyName.substring(0, i + 1);
            
            for (int j = 0; j < givenName.length(); j++) {
                String t = givenName.substring(0, j + 1);
                handles.add(s.concat(t));
            }
        }
        
        return handles.size();
    }

}