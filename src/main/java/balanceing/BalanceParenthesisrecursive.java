package balanceing;

import com.google.common.primitives.Chars;

import java.util.Iterator;
import java.util.List;

public class BalanceParenthesisrecursive implements BalanceParenthesis{

    public boolean balance(String parenthesisString) {

        List<Character> characters = Chars.asList(parenthesisString.toCharArray());

        return balanceInternal(characters.iterator(), 0);
    }

    private boolean balanceInternal(Iterator<Character> characters, int balance) {
        if (balance < 0) {
            return false;
        }

        if (characters.hasNext()){
            final char currentChar = characters.next().charValue();
            if (currentChar == '('){
                return balanceInternal(characters, ++balance);
            }
            else if (currentChar == ')'){
                return balanceInternal(characters, --balance);
            }
            else {
                return false;
            }
        }
        return balance == 0;
    }

}
