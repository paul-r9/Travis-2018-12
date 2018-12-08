import org.junit.Assert;
import org.junit.Test;
import sun.util.resources.nl.CurrencyNames_nl_NL;

public class SampleTest {
    @Test
    public void NewBoard_boardIsEmptyAfterCreation() {
        char [][] board = new char [3][3];
        for (int outerIndex = 0; outerIndex < 3; outerIndex++ ){
            for (int innerIndex = 0; innerIndex < 3; innerIndex++ ){
                board [outerIndex][innerIndex] = ' ';
            }
        }

        // arrange
        TicTacToe ttt = new TicTacToe();

        // assert
        Assert.assertArrayEquals(board,ttt.getBoard());
    }

    @Test
    public void NewBoard_valueAfterFirstEntryIsX() {
        TicTacToe ttt = new TicTacToe();

        ttt.play(0, 0);

        char [][] currentBoard = ttt.getBoard();

        Assert.assertEquals('X',currentBoard[0][0]);

    }

    @Test
    public void NewBoard_valueAfterSecondEntryIsO() {
        TicTacToe ttt = new TicTacToe();

        ttt.play(0, 0);
        ttt.play(1,1);
        char [][] currentBoard = ttt.getBoard();

        Assert.assertEquals('O',currentBoard[1][1]);
    }

    @Test
    public void NewBoard_cannotPlayInSameSquare() {
        TicTacToe ttt = new TicTacToe();

        ttt.play(0, 0);
        boolean playResult = ttt.play(0,0);

        Assert.assertFalse(playResult);
    }

    @Test
    public void NewBoard_winningPlayVertical() {
        TicTacToe ttt = new TicTacToe();

        ttt.play(0, 0); // X
        ttt.play(0, 1);
        ttt.play(1, 0); // X
        ttt.play(1, 1);
        ttt.play(2, 0); // X

        boolean gameOver = ttt.isGameOver();

        Assert.assertTrue(gameOver);
    }

    @Test
    public void NewBoard_winningPlayHorizontal() {
        TicTacToe ttt = new TicTacToe();

        ttt.play(0, 0); // X
        ttt.play(1, 1);
        ttt.play(0, 1); // X
        ttt.play(1, 2);
        ttt.play(0, 2); // X

        boolean gameOver = ttt.isGameOver();

        Assert.assertTrue(gameOver);
    }

    @Test
    public void NewBoard_notWinningPlay() {
        TicTacToe ttt = new TicTacToe();

        ttt.play(0, 0);
        ttt.play(0, 1);
        ttt.play(1, 0);
        ttt.play(1, 1);
        ttt.play(2, 2);

        boolean gameOver = ttt.isGameOver();

        Assert.assertFalse(gameOver);
    }

    //    A B C
    // 1. _ X _
    // 2. _ _ _
    // 3. _ _ _
    //
    // 1A
}
