package codecool;

import java.util.HashMap;
import java.util.Map;

public class FizzBuzz {

    private static final StringBuilder result = new StringBuilder();
    private final Map<Integer, String> toDisplay = new HashMap<>();

    public FizzBuzz() {
         toDisplay.put(3, "Fizz");
         toDisplay.put(5, "Buzz");
         toDisplay.put(7, "Bum");
    }

    public void fizzBuzz(int amount, Map<Integer, String> newToDisplay) {
        toDisplay.putAll(newToDisplay);

        for (int i = 1; i <= amount; i++) {
            for (Integer key : toDisplay.keySet()) if (i % key == 0) result.append(toDisplay.get(key));
            System.out.println(i + " " + result.toString());
            result.setLength(0);
        }
    }
}
