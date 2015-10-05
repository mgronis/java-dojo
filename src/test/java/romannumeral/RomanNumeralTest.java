package romannumeral;

import com.google.common.collect.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class RomanNumeralTest {

    public final int arabicNumber;
    public final String romanNumber;

    @Parameters(name = "Arabic number {0} should be Roman number {1}")
    public static Collection<Object[]> data() {
        return Lists.newArrayList(new Object[][]{
                {1, "I"}, {2, "II"}, {3, "III"}, {4, "IV"}, {5, "V"}, {6, "VI"}, {7, "VII"}, {8, "VIII"},
                {9, "IX"}, {10, "X"}, {11, "XI"}, {48, "XXXXVIII"}, {49, "IL"}, {50, "L"}, {51, "LI"}, {61, "LXI"},
                {98, "LXXXXVIII"}, {99, "IC"}, {100, "C"}, {101, "CI"}, {149, "CIL"}, {498, "CCCCLXXXXVIII"},
                {499, "ID"}, {500, "D"}, {501, "DI"}, {734, "DCCXXXIV"}, {998, "DCCCCLXXXXVIII"}, {999, "IM"}, {1000, "M"},
                {1001, "MI"}, {4998, "MMMMDCCCCLXXXXVIII"}
        });
    }

    public RomanNumeralTest(int arabicNumber, String romanNumber) {
        this.arabicNumber = arabicNumber;
        this.romanNumber = romanNumber;
    }

    @Test
    public void convertToRomanNumber(){
        assertThat(new RomanNumeral().convert(arabicNumber), is(romanNumber));
    }

}