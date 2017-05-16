/**
 * Created by vasilis on 16-5-17.
 */
public class FizzBuzzRound2 {
    public static String getResult(Integer value){
        if(value % 3 == 0) return "fizz";
        return value.toString();
    }
}
