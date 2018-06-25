package codecool;

import java.util.HashMap;

public class Fibonacci {

    private HashMap<Long, Long> saved = new HashMap<>();

    public long get(long numberOfElement) {
        if (numberOfElement == 1 || numberOfElement == 2) return 1;
        if (saved.get(numberOfElement) != null) return saved.get(numberOfElement);
        saved.put(numberOfElement, get(numberOfElement - 1) + get(numberOfElement - 2));
        return saved.get(numberOfElement);
    }
}
