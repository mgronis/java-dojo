package balanceing;

import com.google.common.primitives.Chars;

import java.util.Iterator;
import java.util.List;

public class BalanceParenthesisrecursive {

    public static boolean balance(String parenthesisString) {

        List<Character> characters = Chars.asList(parenthesisString.toCharArray());

        return balanceInternal(characters.iterator(), 0);
    }

    private static boolean balanceInternal(Iterator<Character> characters, int balance) {
        if (characters.hasNext()){
            final char currentChar = characters.next().charValue();
            if (currentChar == '('){
                return balanceInternal(characters, ++balance);
            }
        }
        return balance == 0;
    }

}
