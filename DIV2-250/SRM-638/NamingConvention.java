import java.util.*;

public class NamingConvention {

    public String toCamelCase(String variableName) {
        StringBuilder res = new StringBuilder();
        
        boolean capitalize = false;
        for (int i = 0; i < variableName.length(); i++) {
            char c = variableName.charAt(i);
            
            if (c == '_') capitalize = true;
            else {
                if (capitalize) {
                    c = Character.toUpperCase(c);
                    capitalize = false;
                }
                res.append(c);
            }
        }
        
        return res.toString();
    }

}