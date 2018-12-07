import org.junit.Assert;
import org.junit.Test;

public class SampleTest {

    // input x,y coordinates
    // 0,0 0,1 0,2
    // 1,0 1,1 1,2
    // 2,0 2,1 2,2

    // validate coordinates

    @Test
    public void input_atNegativeX_expectInvalid() {
        boolean isValid = TicTacToe.isValidCoordinate(-1, 0);
        Assert.assertFalse("-X coordinate", isValid);
    }
    @Test
    public void input_atZeroX_expectValid() {
        boolean isValid = TicTacToe.isValidCoordinate(0, 0);
        Assert.assertTrue("Zero X coordinate", isValid);
    }
    @Test
    public void input_atNegativeY_expectInvalid() {
        boolean isValid = TicTacToe.isValidCoordinate(0, -1);
        Assert.assertFalse("-Y coordinate", isValid);
    }

    @Test
    public void input_atZeroY_expectValid() {
        boolean isValid = TicTacToe.isValidCoordinate(0, 0);
        Assert.assertTrue("Zero Y coordinate", isValid);
    }
    @Test
    public void input_atTwoY_expectValid() {
        boolean isValid = TicTacToe.isValidCoordinate(0, 2);
        Assert.assertTrue("Two Y coordinate", isValid);
    }
    @Test
    public void input_atTwoX_expectValid() {
        boolean isValid = TicTacToe.isValidCoordinate(2, 2);
        Assert.assertTrue("Two X coordinate", isValid);
    }

    @Test
    public void input_atThreeX_expectInvalid() {
        boolean isValid = TicTacToe.isValidCoordinate(3, 2);
        Assert.assertFalse("3 X coordinate", isValid);
    }

    @Test
    public void input_atThreeY_expectInValid() {
        boolean isValid = TicTacToe.isValidCoordinate(2, 3);
        Assert.assertFalse("3 y coordinate", isValid);
    }

    @Test
    public void placeToken_At0_0_expectIsTaken() {
        TicTacToe.placeToken(0, 0);
        boolean isTaken = TicTacToe.isCoordTaken(0,0);
        Assert.assertTrue("Token ", isTaken);
    }

    @Test
    public void isCoordinateTaken_expectNotTaken() {
        boolean isTaken = TicTacToe.isCoordTaken(0,0);
        Assert.assertFalse("Token ", isTaken);
    }
}
