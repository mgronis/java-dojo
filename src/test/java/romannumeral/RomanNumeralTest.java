package romannumeral;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RomanNumeralTest {

    @Test
    public void convert_1_shouldGive_I(){
        assertThat(new RomanNumeral().convert(1), is("I"));
    }

    @Test
    public void convert_2_shouldGive_II(){
        assertThat(new RomanNumeral().convert(2), is("II"));
    }

    @Test
    public void convert_3_shouldGive_III(){
        assertThat(new RomanNumeral().convert(3), is("III"));
    }

    @Test
    public void convert_4_shouldGive_IV(){
        assertThat(new RomanNumeral().convert(4), is("IV"));
    }

    @Test
    public void convert_5_shouldGive_V(){
        assertThat(new RomanNumeral().convert(5), is("V"));
    }

    @Test
    public void convert_6_shouldGive_VI(){
        assertThat(new RomanNumeral().convert(6), is("VI"));
    }

    @Test
    public void convert_7_shouldGive_VII(){
        assertThat(new RomanNumeral().convert(7), is("VII"));
    }

    @Test
    public void convert_8_shouldGive_VIII(){
        assertThat(new RomanNumeral().convert(8), is("VIII"));
    }

    @Test
    public void convert_9_shouldGive_IX(){
        assertThat(new RomanNumeral().convert(9), is("IX"));
    }

}