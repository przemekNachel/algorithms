package codecool;

import java.util.HashMap;

public class FindPair {

    private HashMap<Integer, Integer> hash = new HashMap<>();

    public boolean find(int[] array, int a) {
        for (int i : array) {
            if (hash.get(a - i) != null) return true;
            hash.put(i, i);
        }
        return false;
    }
}
