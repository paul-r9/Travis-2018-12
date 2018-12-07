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
}
