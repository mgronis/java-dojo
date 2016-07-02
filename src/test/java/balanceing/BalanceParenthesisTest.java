package balanceing;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BalanceParenthesisTest {

    private static final String EMPTY = "";
    public static final String PARENTHESIS_PAIR = "()";
    public static final String INVERTED_PARENTHESIS_PAIR = ")(";
    public static final String NESTED_PARENTHESIS_PAIR = "(())";

    @Test
    public void noParenthesisShouldBeBalanced() {
        assertThat(BalanceParenthesis.balance(EMPTY), is(true));
    }

    @Test
    public void openingParnthesisShouldNotBeBalanced() {
        assertThat(BalanceParenthesis.balance("("), is(false));
    }

    @Test
    public void closingParnthesisShouldNotBeBalanced() {
        assertThat(BalanceParenthesis.balance(")"), is(false));
    }

    @Test
    public void invalidInputShouldNotBeBalanced() {
        assertThat(BalanceParenthesis.balance("a"), is(false));
    }

    @Test
    public void onePairOfOpeningAndClosingShoundlBeBalanced() {
        assertThat(BalanceParenthesis.balance(PARENTHESIS_PAIR), is(true));
    }

    @Test
    public void twoPairsOfOpeningAndClosingShoundlBeBalanced() {
        assertThat(BalanceParenthesis.balance(PARENTHESIS_PAIR + PARENTHESIS_PAIR), is(true));
    }

    @Test
    public void onePairOfClosingAndOpeningShoundlNotBeBalanced() {
        assertThat(BalanceParenthesis.balance(INVERTED_PARENTHESIS_PAIR), is(false));
    }

    @Test
    public void nestedPairOfOpeningAndClosingShoundlBeBalanced() {
        assertThat(BalanceParenthesis.balance(NESTED_PARENTHESIS_PAIR), is(true));
    }

    @Test
    public void onePairOfOpeningAndClosingPlusAnExtraClosingShoundlBeBalanced() {
        assertThat(BalanceParenthesis.balance(PARENTHESIS_PAIR + ")"), is(false));
    }

}