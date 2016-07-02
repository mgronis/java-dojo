package balanceing;

import org.junit.Test;

import static balanceing.BalanceParenthesisForEachLoop.balance;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BalanceParenthesisForEachLoopTest {

    private static final String EMPTY = "";
    public static final String PARENTHESIS_PAIR = "()";
    public static final String INVERTED_PARENTHESIS_PAIR = ")(";
    public static final String NESTED_PARENTHESIS_PAIR = "(())";
    public static final String MULTI_NESTED_PARENTHESIS_PAIR = "(()(()()))";

    @Test
    public void noParenthesisShouldBeBalanced() {
        assertThat(balance(EMPTY), is(true));
    }

    @Test
    public void openingParnthesisShouldNotBeBalanced() {
        assertThat(balance("("), is(false));
    }

    @Test
    public void closingParnthesisShouldNotBeBalanced() {
        assertThat(balance(")"), is(false));
    }

    @Test
    public void invalidInputShouldNotBeBalanced() {
        assertThat(balance("a"), is(false));
    }

    @Test
    public void onePairOfOpeningAndClosingShoundlBeBalanced() {
        assertThat(balance(PARENTHESIS_PAIR), is(true));
    }

    @Test
    public void twoPairsOfOpeningAndClosingShoundlBeBalanced() {
        assertThat(balance(PARENTHESIS_PAIR + PARENTHESIS_PAIR), is(true));
    }

    @Test
    public void onePairOfClosingAndOpeningShoundlNotBeBalanced() {
        assertThat(balance(INVERTED_PARENTHESIS_PAIR), is(false));
    }

    @Test
    public void nestedPairOfOpeningAndClosingShoundlBeBalanced() {
        assertThat(balance(NESTED_PARENTHESIS_PAIR), is(true));
    }

    @Test
    public void onePairOfOpeningAndClosingPlusAnExtraClosingShoundlBeBalanced() {
        assertThat(balance(PARENTHESIS_PAIR + ")"), is(false));
    }

    @Test
    public void multiNestedShouldBeBalanced() {
        assertThat(balance(MULTI_NESTED_PARENTHESIS_PAIR), is(true));
    }

}