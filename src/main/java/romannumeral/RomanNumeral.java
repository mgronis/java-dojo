package romannumeral;

public class RomanNumeral {

    public static final String IV = "IV";
    public static final String I = "I";
    public static final String V = "V";

    public String convert(int arabicNumber) {

        while (arabicNumber > 0) {
            if (arabicNumber == 9) {
                return "IX";
            } else if (arabicNumber >= 5) {
                return V + convert(arabicNumber - 5);
            } else if (arabicNumber == 4) {
                return IV;
            } else {
                return I + convert(--arabicNumber);
            }
        }

        return "";
    }

}
