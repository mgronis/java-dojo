package fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public FizzBuzz() {
    }

    public String go(int input) {
        StringBuilder builder = new StringBuilder();

        if (divisibleByThree(input)) {
            builder.append(FIZZ);
        }
        if (divisibleByFive(input)) {
            builder.append(BUZZ);
        }
        if (!(divisibleByThree(input) || divisibleByFive(input))) {
            builder.append(input);
        }

        return builder.toString();
    }

    private boolean divisibleByFive(int input) {
        return input % 5 == 0;
    }

    private boolean divisibleByThree(int input) {
        return input % 3 == 0;
    }

}
