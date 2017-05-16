import org.junit.Assert;
import org.junit.Test;

/**
 * Created by vasilis on 16-5-17.
 */
public class FizzBuzzRound2Test {
    @Test
    public void getResultDividableByThree(){
        Assert.assertEquals("Fizz", FizzBuzzRound2.getResult(3));
    }

    @Test
    public void getResultDividableByFive(){
        Assert.assertEquals("Buzz", FizzBuzzRound2.getResult(5));
        Assert.assertEquals("Buzz", FizzBuzzRound2.getResult(10));
    }
    @Test
    public void getResultDividableByBoth(){
        Assert.assertEquals("FizzBuzz", FizzBuzzRound2.getResult(15));
        Assert.assertEquals("FizzBuzz", FizzBuzzRound2.getResult(30));
    }
}
