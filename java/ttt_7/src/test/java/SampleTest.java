import org.junit.Assert;
import org.junit.Test;
import sun.util.resources.nl.CurrencyNames_nl_NL;

public class SampleTest {

    @Test
    public void exampleTest() {
        Assert.assertTrue("Example of a passing assertion", true);
    }

    @Test
    public void NewBoard_boardIsEmpty() {
        // arrange
        TicTacToe ttt = new TicTacToe();
        char [][] board = new char [3][3];
        for (int outerIndex = 0; outerIndex < 3; outerIndex++ ){
            for (int innerIndex = 0; innerIndex < 3; innerIndex++ ){
                board [outerIndex][innerIndex] = ' ';
            }
        }
        // act on ttt

        // assert
        Assert.assertArrayEquals(board,ttt.getBoard());
    }

    //    A B C
    // 1. _ X _
    // 2. _ _ _
    // 3. _ _ _
    //
    // 1A
}
