package romannumeral;

public class RomanNumeral {

    public static final String IV = "IV";
    public static final String I = "I";
    public static final String V = "V";
    public static final String IX = "IX";
    public static final String X = "X";
    public static final String L = "L";
    public static final String C = "C";
    public static final String D = "D";
    public static final String M = "M";
    public static final String XL = "XL";
    public static final String XC = "XC";
    public static final String CD = "CD";
    public static final String CM = "CM";

    public String convert(int arabicNumber) {
        

        while (arabicNumber > 0) {
            if (arabicNumber >= 1000) {
                return M + convert(arabicNumber - 1000);
            }else if (arabicNumber >= 900) {
                return CM + convert(arabicNumber - 900);
            }else if (arabicNumber >= 500) {
                return D + convert(arabicNumber - 500);
            }else if (arabicNumber >= 400) {
                return CD + convert(arabicNumber - 400);
            }else if (arabicNumber >= 100) {
                return C + convert(arabicNumber - 100);
            }else if (arabicNumber >= 90) {
                return XC + convert(arabicNumber - 90);
            }else if (arabicNumber >= 50) {
                return L + convert(arabicNumber - 50);
            }else if (arabicNumber >= 40) {
                return XL + convert(arabicNumber - 40);
            }else if (arabicNumber >= 10) {
                return X + convert(arabicNumber - 10);
            }else if (arabicNumber >= 9) {
                return IX + convert(arabicNumber - 9);
            } else if (arabicNumber >= 5) {
                return V + convert(arabicNumber - 5);
            } else if (arabicNumber >= 4) {
                return IV + convert(arabicNumber - 4);
            } else {
                return I + convert(arabicNumber - 1);
            }
        }

        return "";
    }

}
