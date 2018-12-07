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
        Assert.assertFalse("-X coordinate", isValid);
    }
    @Test
    public void placeToken_atZeroX_expectValid() {
        boolean isValid = TicTacToe.isValidCoordinate(0, 0);
        Assert.assertTrue("Zero X coordinate", isValid);
    }
    @Test
    public void placeToken_atNegativeY_expectInvalid() {
        boolean isValid = TicTacToe.isValidCoordinate(0, -1);
        Assert.assertFalse("-Y coordinate", isValid);
    }

    @Test
    public void placeToken_atZeroY_expectValid() {
        boolean isValid = TicTacToe.isValidCoordinate(0, 0);
        Assert.assertTrue("Zero Y coordinate", isValid);
    }
    @Test
    public void placeToken_atTwoY_expectValid() {
        boolean isValid = TicTacToe.isValidCoordinate(0, 2);
        Assert.assertTrue("Two Y coordinate", isValid);
    }
    @Test
    public void placeToken_atTwoX_expectValid() {
        boolean isValid = TicTacToe.isValidCoordinate(2, 2);
        Assert.assertTrue("Two X coordinate", isValid);
    }
}
