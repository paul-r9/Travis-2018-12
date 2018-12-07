import org.junit.Assert;
import org.junit.Test;

public class SampleTest {

    // input x,y coordinates
    // 0,0 0,1 0,2
    // 1,0 1,1 1,2
    // 2,0 2,1 2,2

    // validate coordinates

    @Test
    public void placeToken_atNegativeX_expectInvalid() {
        boolean isValid = TicTacToe.isValidCoordinate(-1, 0);
        Assert.assertFalse("Negative X coordinate", isValid);
    }
}
