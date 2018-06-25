package codecool;

public class Algorithms {

    public String reverseAString(String string) {
        char[] chars = string.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            builder.append(chars[i]);
        }
        return builder.toString();
    }

    public int factorialize(int toFactorialize) {
        int value = 1;
        for (int i = 2; i <= toFactorialize; i++) {
            value *= i;
        }
        return value;
    }

    public boolean isPalindrome(String toCheck) {
        toCheck = toCheck.replaceAll("\\P{Alnum}", "");
        String reversed = reverseAString(toCheck);
        if (reversed.toLowerCase().equals(toCheck.toLowerCase())) return true;
        return false;
    }

    public String findLongestWord(String sentence) {
        int longestLength = 0;
        String longest = null;
        String[] words = sentence.split(" ");
        for (String string : words) {
            if(string.length() > longestLength) {
                longestLength = string.length();
                longest = string;
            }
        }
        return longestLength + ", \"" + longest + "\"";
    }

    public String titleCase(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : words) {
            stringBuilder.append(string.substring(0, 1).toUpperCase());
            stringBuilder.append(string.substring(1, string.length()).toLowerCase() + " ");
        }
        stringBuilder.setLength(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }
}
