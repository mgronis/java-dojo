package romannumeral;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RomanNumeralTest {

    @Test
    public void test(){
        assertThat(new RomanNumeral().convert(1), is("I"));
    }

}