import org.junit.Assert;
import org.junit.Test;

public class SampleTest {
	private String emptyBoard="___\n___\n___\n";
    @Test
    public void test_print_empty_board() {
    	TicTacToe ttt = new TicTacToe();
    	Assert.assertEquals(emptyBoard, ttt.printBoard());
    }
}
