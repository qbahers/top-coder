import java.util.*;

public class CatAndRat {

    public double getTime(int R, int T, int Vrat, int Vcat) {
        double res;
        
        if (Vrat >= Vcat) {
            res = -1;
        }
        else {
            res = Math.min(Math.PI * R, Vrat * T) / (Vcat - Vrat);
        }
        
        return res;
    }

}