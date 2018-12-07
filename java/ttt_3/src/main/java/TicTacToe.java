public class TicTacToe {
	private char[][] board;

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
    public TicTacToe() {
    	board = new char[3][3];
    }
    
    public String printBoard() {
    	String boardStr = "";
    	for( int i = 0; i < board.length; i++ ) {
    		for( int j = 0; j < board[i].length; j++) {
    			if (board[i][j] != '\0') {
    				boardStr += board[i][j];
    			} else {
    				boardStr += "_";
    			}
    		}
    		boardStr += "\n";
    	}
    	System.out.println( boardStr );
    	return boardStr;
    }
    
    public void addChar(char mark,int x,int y) {
    	board[x][y] = mark;
    }
}
