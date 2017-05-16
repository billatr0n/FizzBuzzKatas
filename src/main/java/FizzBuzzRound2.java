/**
 * Created by vasilis on 16-5-17.
 */
public class FizzBuzzRound2 {

    public static String FIZZ = "fizz";
    public static String BUZZ = "buzz";

    public static String getResult(Integer value){
        if(isDividableByThree(value))
            return FIZZ;
        else if(isDividableByFive(value))
            return BUZZ;
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
}
