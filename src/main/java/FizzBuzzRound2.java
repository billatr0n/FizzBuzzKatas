/**
 * Created by vasilis on 16-5-17.
 */
public class FizzBuzzRound2 {

    public static String FIZZ = "Fizz";
    public static String BUZZ = "Buzz";
    public static String FIZZBUZZ = "FizzBuzz";

    public static String getResult(Integer value){
        if(isDividableByThree(value))
            return FIZZ;
        else if(isDividableByFive(value))
            return BUZZ;
        else if(isDividableByBoth(value))
            return FIZZBUZZ;
        return value.toString();
    }
    public static boolean isDividableByThree(Integer value){
        if(value % 3 == 0){
            return true;
        }
        return false;
    }

    public static boolean isDividableByFive(Integer value){
        if(value % 5 == 0){
            return true;
        }
        return false;
    }

    public static boolean isDividableByBoth(Integer value){
        if(value % 15 == 0){
            return true;
        }
        return false;
    }
}
