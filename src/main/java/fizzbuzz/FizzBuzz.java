package fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";

    public FizzBuzz() {
    }

    public String go(int input) {
        if (input %3 == 0) {
            return FIZZ;
        }
        return "" + input;
    }

}
