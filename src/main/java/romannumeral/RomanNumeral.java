package romannumeral;

public class RomanNumeral {

    public static final String IV = "IV";
    public static final String I = "I";
    public static final String V = "V";
    public static final String IX = "IX";
    public static final String X = "X";
    public static final String IL = "IL";
    public static final String L = "L";
    public static final String IC = "IC";
    public static final String C = "C";
    public static final String ID = "ID";
    public static final String D = "D";

    public String convert(int arabicNumber) {

        while (arabicNumber > 0) {
            if (arabicNumber >= 500) {
                return D + convert(arabicNumber - 500);
            }else if (arabicNumber == 499) {
                return ID;
            }else if (arabicNumber >= 100) {
                return C + convert(arabicNumber - 100);
            }else if (arabicNumber == 99) {
                return IC;
            }else if (arabicNumber >= 50) {
                return L + convert(arabicNumber - 50);
            }else if (arabicNumber == 49) {
                return IL;
            }else if (arabicNumber >= 10) {
                return X + convert(arabicNumber - 10);
            }else if (arabicNumber == 9) {
                return IX;
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
