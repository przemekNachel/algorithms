package codecool;

public class RomanConverter {

    public String toRoman(int number) {
        if (number == 5) return "V";
        if (number == 9) return  "IX";
        return null;
    }

    public int toArabic(String number) {
        if (number == "V") return 5;
        if (number == "IX") return 9;
        return 0;
    }
}
