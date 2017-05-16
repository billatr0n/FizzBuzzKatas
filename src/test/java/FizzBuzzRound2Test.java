import org.junit.Assert;
import org.junit.Test;

/**
 * Created by vasilis on 16-5-17.
 */
public class FizzBuzzRound2Test {
    @Test
    public void getResultDividableByThree(){
        Assert.assertEquals("fizz", FizzBuzzRound2.getResult(3));

    }
}
