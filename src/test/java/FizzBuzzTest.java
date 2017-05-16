import org.junit.Assert;
import org.junit.Test;

/**
 * Created by vasilis on 15-5-17.
 */
public class FizzBuzzTest {

    @Test
    public void getResultIfDividedByThree() {
        Assert.assertEquals("fizz", FizzBuzz.getResult(3));
    }

    @Test
    public void getResultIfDividedByFive() {
        Assert.assertEquals("buzz", FizzBuzz.getResult(5));
        Assert.assertEquals("buzz", FizzBuzz.getResult(10));
    }

    @Test
    public void getResultIfDividedByBoth() {
        Assert.assertEquals("fizzbuzz", FizzBuzz.getResult(15));
        Assert.assertEquals("fizzbuzz", FizzBuzz.getResult(30));
    }

    @Test
    public void getResultIfDividedByNone() {
        Assert.assertEquals("1", FizzBuzz.getResult(1));
        Assert.assertEquals("2", FizzBuzz.getResult(2));
        Assert.assertEquals("4", FizzBuzz.getResult(4));
    }

}