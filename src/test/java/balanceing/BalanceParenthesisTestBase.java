package balanceing;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public abstract class BalanceParenthesisTestBase {

    private static final String EMPTY = "";
    private static final String PARENTHESIS_PAIR = "()";
    private static final String INVERTED_PARENTHESIS_PAIR = ")(";
    private static final String NESTED_PARENTHESIS_PAIR = "(())";
    private static final String MULTI_NESTED_PARENTHESIS_PAIR = "(()(()()))";
    private BalanceParenthesis balanceParenthesis;

    BalanceParenthesisTestBase(BalanceParenthesis balanceParenthesis) {
        this.balanceParenthesis = balanceParenthesis;
    }

    @Test
    public void noParenthesisShouldBeBalanced() {
        assertThat(balanceParenthesis.balance(EMPTY), is(true));
    }

    @Test
    public void openingParnthesisShouldNotBeBalanced() {
        assertThat(balanceParenthesis.balance("("), is(false));
    }

    @Test
    public void closingParnthesisShouldNotBeBalanced() {
        assertThat(balanceParenthesis.balance(")"), is(false));
    }

    @Test
    public void invalidInputShouldNotBeBalanced() {
        assertThat(balanceParenthesis.balance("a"), is(false));
    }

    @Test
    public void onePairOfOpeningAndClosingShoundlBeBalanced() {
        assertThat(balanceParenthesis.balance(PARENTHESIS_PAIR), is(true));
    }

    @Test
    public void twoPairsOfOpeningAndClosingShoundlBeBalanced() {
        assertThat(balanceParenthesis.balance(PARENTHESIS_PAIR + PARENTHESIS_PAIR), is(true));
    }

    @Test
    public void onePairOfClosingAndOpeningShoundlNotBeBalanced() {
        assertThat(balanceParenthesis.balance(INVERTED_PARENTHESIS_PAIR), is(false));
    }

    @Test
    public void nestedPairOfOpeningAndClosingShoundlBeBalanced() {
        assertThat(balanceParenthesis.balance(NESTED_PARENTHESIS_PAIR), is(true));
    }

    @Test
    public void onePairOfOpeningAndClosingPlusAnExtraClosingShoundlBeBalanced() {
        assertThat(balanceParenthesis.balance(PARENTHESIS_PAIR + ")"), is(false));
    }

    @Test
    public void multiNestedShouldBeBalanced() {
        assertThat(balanceParenthesis.balance(MULTI_NESTED_PARENTHESIS_PAIR), is(true));
    }

}