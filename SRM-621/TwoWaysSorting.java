import java.util.*;

public class TwoWaysSorting {

    public String sortingMethod(String[] stringList) {
        String[] stringList1 = (String[]) stringList.clone();
        String[] stringList2 = (String[]) stringList.clone();

        Arrays.sort(stringList1);
        Arrays.sort(stringList2, new LengthComparator());

        boolean lexicographicalSort = false;
        boolean lengthSort = false;

        if (Arrays.equals(stringList, stringList1)) lexicographicalSort = true;
        if (Arrays.equals(stringList, stringList2)) lengthSort = true;
        
        if (lexicographicalSort && lengthSort) return "both";
        if (lexicographicalSort) return "lexicographically";
        if (lengthSort) return "lengths";
        return "none";
    }

}

class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        return (a.length() < b.length()) ? -1 : (a.length() == b.length()) ? 0 : 1;
    }
}

