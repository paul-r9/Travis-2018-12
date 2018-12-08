import java.util.Scanner;

public class TicTacToe {
	private char[][] board;

    public static void main(String[] args) {
    	TicTacToe ttt = new TicTacToe();
    	while (true) {
    		ttt.printBoard();
    		System.out.print("Enter Mark: ");
    		Scanner input = new Scanner(System.in);
    		char mark = input.nextLine().charAt(0);
    		System.out.print("Enter X: ");
    		int x = input.nextInt();
    		System.out.print("Enter Y: ");
    		int y = input.nextInt();
    		ttt.addChar(mark, x, y);
    	}
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
    
    public boolean addChar(char mark,int x,int y) {
    	if (x > 2 || y > 2) {
    		System.out.println("X and Y coordinate cannot be greater than 2");
    		return false;
    	}
    	if (board[y][x]== '\0') {
    		board[y][x] = mark;
    		return true;
    	}
    	
       	return false;
    }
}
