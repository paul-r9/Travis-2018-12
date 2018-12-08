import org.junit.Assert;
import org.junit.Test;

public class SampleTest {
	private String emptyBoard="___\n___\n___\n";
    @Test
    public void test_print_empty_board() {
    	TicTacToe ttt = new TicTacToe();
    	Assert.assertEquals(emptyBoard, ttt.printBoard());
    }
    
    @Test
    public void test_input_command(){
    	TicTacToe ttt = new TicTacToe();
    	String board1 = "X__\n___\n___\n";
    	ttt.addChar('X',0,0);
    	Assert.assertEquals(board1, ttt.printBoard());
    }
    
    @Test
    public void test_no_overwrite(){
    	TicTacToe ttt = new TicTacToe();
    	String board1 = "X__\n___\n___\n";
    	ttt.addChar('X',0,0);
    	Assert.assertEquals(board1, ttt.printBoard());
    	Assert.assertFalse( ttt.addChar('Y',0,0) );
    }
}
