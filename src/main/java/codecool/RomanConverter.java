package codecool;

import java.util.TreeMap;

public class RomanConverter {

    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    public String toRoman(int number) {
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
        int l = map.floorKey(number);
        if (number == l) {
            return map.get(number);
        }
        return map.get(l) + toRoman(number - l);
    }

    private int decodeSingle(String string, int index) {
        String sign = Character.toString(string.charAt(index));
        if (sign.equals("M")) return 1000;
        if (sign.equals("D")) return 500;
        if (sign.equals("C")) return 100;
        if (sign.equals("L")) return 50;
        if (sign.equals("X")) return 10;
        if (sign.equals("V")) return 5;
        if (sign.equals("I")) return 1;
        return 0;
    }

    public int toArabic(String roman) {
        int arabic = 0;

        for (int i = 0; i < roman.length() - 1; i++) {
            int current = decodeSingle(roman, i);
            int next = decodeSingle(roman, i + 1);

            if (current < next) arabic -= current;
            else arabic += current;
        }
        arabic += decodeSingle(roman, roman.length() - 1);
        return arabic;
    }
}

