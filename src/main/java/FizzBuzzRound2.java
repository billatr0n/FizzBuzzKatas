import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by vasilis on 16-5-17.
 */
public class FizzBuzzRound2 {

    public static String FIZZ = "Fizz";
    public static String BUZZ = "Buzz";
    public static String FIZZBUZZ = "FizzBuzz";


    public static String getResult(Integer dividend) {
        Map<Integer, String> dividingCases = new LinkedHashMap<Integer, String>();
        dividingCases.put(15, FIZZBUZZ);
        dividingCases.put(5, BUZZ);
        dividingCases.put(3, FIZZ);

        Iterator casesIterator = dividingCases.entrySet().iterator();
        while(casesIterator.hasNext()){
            Map.Entry pair = (Map.Entry)casesIterator.next();
            if(isDividable(dividend,Integer.parseInt(pair.getKey().toString()))){
                return pair.getValue().toString();
            }
        }
        return dividend.toString();
    }
    public static boolean isDividable(Integer dividend, Integer divisor) {
        return dividend % divisor == 0;
    }
}
