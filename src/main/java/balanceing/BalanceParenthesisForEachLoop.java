package balanceing;

public class BalanceParenthesisForEachLoop {

    public static boolean balance(String parenthesisString) {
        int balance = 0;

        for (char currentCharInString : parenthesisString.toCharArray()) {
            if (balance < 0) {
                return false;
            }

            switch (currentCharInString) {
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
