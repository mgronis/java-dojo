package romannumeral;

public class RomanNumeral {

    public static final String IV = "IV";
    public static final String I = "I";

    public String convert(int arabic) {

        while (arabic > 0) {

            if (arabic == 4) {
                return IV;
            } else {
                return I + convert(--arabic);
            }
        }

        return "";
    }

}
