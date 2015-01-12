import java.util.*;

public class PlatypusDuckAndBeaver {

    public int minimumAnimals(int webbedFeet, int duckBills, int beaverTails) {
        
        for (int i = 0; i <= 1000; i++) {
            int wf = webbedFeet;
            int db = duckBills;
            int bt = beaverTails;
            
            wf -= 4 * i;
            db -= i;
            bt -= i;
            
            if (wf < 0 || db < 0 || bt < 0) continue;
            
            wf -= 4 * bt;
            
            if (wf < 0) continue;
            
            if (2 * db == wf) return db + bt + i;
        }
        
        return -1;
    }

}