import java.util.*;

public class InsertZ {

    public String canTransform(String init, String goal) {
        StringBuilder gl = new StringBuilder(goal);
        int N = gl.length();
        
        for (int i = 0; i < N; i++)
            if (gl.charAt(i) == 'z') {
                gl.deleteCharAt(i);
                N = gl.length();
                i--;
            }
        
        return init.equals(gl.toString()) ? "Yes" : "No";
    }

}