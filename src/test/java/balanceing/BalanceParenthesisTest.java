package balanceing;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BalanceParenthesisTest {

    private static final String empty = "";

    @Test
    public void noParenthesisShouldBeBalanced() {
        assertThat(BalanceParenthesis.balance(empty), is(true));
    }

    @Test
    public void openingParnthesisShouldNotBeBalanced() {
        assertThat(BalanceParenthesis.balance("("), is(false));
    }

    @Test
    public void closingParnthesisShouldNotBeBalanced() {
        assertThat(BalanceParenthesis.balance(")"), is(false));
    }
}