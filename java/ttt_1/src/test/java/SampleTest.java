import org.junit.Assert;
import org.junit.Test;

public class SampleTest {

    @Test
    public void playerEnters1() {
        int userInput = 1;
        Position pos = new Position(0,0);
        TicTacToe ttt = new TicTacToe();
        Assert.assertEquals(pos, ttt.convertInputToPos(userInput));
    }
    @Test
    public void playerEnters5() {
        int userInput = 5;
        Position pos = new Position(1,1);
        TicTacToe ttt = new TicTacToe();
        Assert.assertEquals(pos, ttt.convertInputToPos(userInput));
    }
    @Test
    public void playerEnters_CheckPositionFree() {
        int userInput = 1;
        TicTacToe ttt = new TicTacToe();

        Assert.assertTrue(ttt.isFree(userInput));
    }
    @Test
    public void playPosition() {
        int userInput = 1;
        TicTacToe ttt = new TicTacToe();
        ttt.play(userInput);
        Assert.assertFalse(ttt.isFree(userInput));


    }



}
