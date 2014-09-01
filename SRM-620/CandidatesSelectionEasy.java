import java.util.*;

public class CandidatesSelectionEasy {
    
    public int[] sort(String[] score, int x) {
        List<Candidate> candidates = new ArrayList<Candidate>();

        for (int i = 0; i < score.length; i++) {
            Candidate  candidate = new Candidate(i, score[i].charAt(x));
            candidates.add(candidate);
        }
        Collections.sort(candidates, new SkillLevelComparator());

        int[] candidatesNumbers = new int[score.length];
        int k = 0;
        for (Candidate candidate : candidates) {
            candidatesNumbers[k] = candidate.number;
            k++;
        }

        return candidatesNumbers;
    }

}

class SkillLevelComparator implements Comparator<Candidate> {
    @Override
    public int compare(Candidate a, Candidate b) {
        if (a.skillLevel < b.skillLevel) return -1;
        if (a.skillLevel == b.skillLevel) {
            return a.number < b.number ? -1 : a.number == b.number ? 0 : 1;
        }
        return 1;
    }
}

class Candidate {
    int number;
    char skillLevel;

    Candidate(int number, char skillLevel) {
        this.number = number;
        this.skillLevel = skillLevel;
    }
}
