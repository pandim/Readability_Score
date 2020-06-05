import java.util.Arrays;
import java.util.stream.IntStream;

/* Please, do not rename it */
class Problem {

    public static void main(String[] args) {
        String operator = args[0];
        IntStream stream = Arrays.stream(args).skip(1).mapToInt(Integer::parseInt);
        int result = 0;
        switch (operator) {
            case "MAX":
                result = stream.max().orElse(0);
                break;
            case "MIN":
                result = stream.min().orElse(0);
                break;
            default: //case "SUM":
                result = stream.sum();

        }
        System.out.println(result);
    }
}
