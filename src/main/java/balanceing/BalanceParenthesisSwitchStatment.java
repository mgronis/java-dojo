package balanceing;

public class BalanceParenthesisSwitchStatment {

    public static boolean balance(String parenthesisString) {
        int balance = 0;
        for (int stringPos = 0; stringPos < parenthesisString.length(); stringPos++) {
            if (balance < 0) {
                return false;
            }

            switch (parenthesisString.charAt(stringPos)) {
                case '(':
                    balance++;
                    break;
                case ')':
                    balance--;
                    break;
                default:
                    return false;
            }
        }
        return balance == 0;
    }

}
