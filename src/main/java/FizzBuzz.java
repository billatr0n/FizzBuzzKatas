/**
 * Created by vasilis on 15-5-17.
 */
public class FizzBuzz {
    static String getResult(Integer value) {
        if (value % 15 == 0) return "fizzbuzz";
        else if (value % 5 == 0) return "buzz";
        else if (value % 3 == 0) return "fizz";
        return Integer.toString(value);
    }
}