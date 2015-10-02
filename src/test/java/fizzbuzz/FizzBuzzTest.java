package fizzbuzz;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void input_1_shouldGive_1(){
        assertThat(new FizzBuzz().go(1), is("1"));
    }

}