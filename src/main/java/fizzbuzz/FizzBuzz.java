package fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public FizzBuzz() {
    }

    public String go(int input) {
        if (input % 15 == 0) {
            return "FizzBuzz";
        }
        if (input % 3 == 0) {
            return FIZZ;
        }
        if (input % 5 == 0) {
            return BUZZ;
        }
        return "" + input;
    }

}
