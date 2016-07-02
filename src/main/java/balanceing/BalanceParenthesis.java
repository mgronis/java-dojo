package balanceing;

public class BalanceParenthesis {

    public static boolean balance(String parenthesisString) {
        int balance = 0;
        for (int stringPos = 0; stringPos < parenthesisString.length(); stringPos++) {
            if (balance < 0) {
                return false;
            }
            if (parenthesisString.charAt(stringPos) == '('){
                balance++;
            }
            else if (parenthesisString.charAt(stringPos) == ')'){
                balance--;
            }
            else {
                return false;
            }

        }
        return balance == 0;
    }

}
