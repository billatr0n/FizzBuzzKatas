/**
 * Created by vasilis on 16-5-17.
 */
public class FizzBuzzRound2 {

    public static String FIZZ = "fizz";

    public static String getResult(Integer value){
        if(isDividableByThree(value))
            return FIZZ;

        return value.toString();
    }
    public static boolean isDividableByThree(Integer value){
        if(value % 3 == 0){
            return true;
        }
        return false;
    }
}
