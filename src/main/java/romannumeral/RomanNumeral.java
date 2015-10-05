package romannumeral;

import com.google.common.base.Preconditions;
import lombok.Value;

public class RomanNumeral {

    private static final RomanConstant[] ROMAN_CONSTANTS = new RomanConstant[]{
            new RomanConstant(1000, "M"),
            new RomanConstant(900, "CM"),
            new RomanConstant(500, "D"),
            new RomanConstant(400, "CD"),
            new RomanConstant(100, "C"),
            new RomanConstant(90, "XC"),
            new RomanConstant(50, "L"),
            new RomanConstant(40, "XL"),
            new RomanConstant(10, "X"),
            new RomanConstant(9, "IX"),
            new RomanConstant(5, "V"),
            new RomanConstant(4, "IV"),
            new RomanConstant(1, "I")
    };

    public String convert(int arabicNumber) {

        Preconditions.checkArgument(arabicNumber >= 0, "Can't handle negative numbers");
        Preconditions.checkArgument(arabicNumber < 5000, "Can't handle numbers greater than 4999");

        for (RomanConstant constant : ROMAN_CONSTANTS) {
            if (arabicNumber >= constant.getArabic()) {
                return constant.getRoman() + convert(arabicNumber - constant.getArabic());
            }
        }

        return "";
    }

    @Value
    private static class RomanConstant {
        private final int arabic;
        private final String roman;
    }

}
