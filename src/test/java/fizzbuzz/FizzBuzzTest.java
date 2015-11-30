package fizzbuzz;

import com.google.common.collect.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class FizzBuzzTest {

    private final int input;
    private final String result;

    @Parameters(name = "input {0} should give {1}")
    public static Collection<Object[]> data() {
        return Lists.newArrayList(new Object[][] {{1, "1"}, {2, "2"}, {3, "Fizz"}, {4, "4"}, {5, "Buzz"}, {15, "FizzBuzz"}});
    }

    public FizzBuzzTest(int input, String result) {
        this.input = input;
        this.result = result;
    }

    @Test
    public void testFizzBuzzWith() {
        assertThat(new FizzBuzz().go(input), is(result));
    }

}
