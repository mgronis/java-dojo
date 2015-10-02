package fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = "FizzBuzz";

    public FizzBuzz() {
    }

    public String go(int input) {
        if (divisibleByFive(input) && divisibleByThree(input)) {
            return FIZZ_BUZZ;
        }
        if (divisibleByThree(input)) {
            return FIZZ;
        }
        if (divisibleByFive(input)) {
            return BUZZ;
        }
        return "" + input;
    }

    private boolean divisibleByFive(int input) {
        return input % 5 == 0;
    }

    private boolean divisibleByThree(int input) {
        return input % 3 == 0;
    }

}
