public class TicTacToe {
	private int[][] board;

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
    public TicTacToe() {
    	board = new int[3][3];
    }
    
    public String printBoard() {
    	String boardStr = "";
    	for( int i = 0; i < board.length; i++ ) {
    		for( int j = 0; j < board[i].length; j++) {
    			boardStr += "_";
    		}
    		boardStr += "\n";
    	}
    	System.out.println( boardStr );
    	return boardStr;
    }
}
