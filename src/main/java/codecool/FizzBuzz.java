package codecool;

import java.util.Map;

public class FizzBuzz {

    public void fizzBuzz(int amount, Map<Integer, String> toDisplay) {
        for (int i = 1; i <= amount; i++) {
            StringBuilder result = new StringBuilder();
            for (Integer key : toDisplay.keySet()) if (i % key == 0) result.append(toDisplay.get(key));
            if (i % 3 == 0) result.append("Fizz");
            if (i % 5 == 0) result.append("Buzz");
            System.out.println(i + " " + result.toString());
        }
    }
}
