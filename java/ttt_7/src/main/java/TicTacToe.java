public class TicTacToe {

    char [][] board;
    char player;

    public TicTacToe() {
        board = new char [3][3];
        player = 'X';
        resetBoard();
    }

    public char [][] getBoard() {
        return board;
    }
    public void resetBoard() {

        for (int outerIndex = 0; outerIndex < 3; outerIndex++ ){
            for (int innerIndex = 0; innerIndex < 3; innerIndex++ ){
                board [outerIndex][innerIndex] = ' ';
            }
        }
    }

    public boolean play(int x, int y) {

        if (!isSquareEmpty(x,y))
            return false;

        board[x][y] = player;

        if (player == 'X') {
            player = 'O';
        } else {
            player = 'X';
        }

        return true;
    }
    public boolean isSquareEmpty(int x, int y) {
        return board[x][y] == ' ';
    }

    public boolean isGameOver() {
        return (testHorizontal() || testVertical());
    }

    private boolean testHorizontal() {

        for (int x = 0; x < 3; x++) {
            if (board[x][0] != ' ' && board[x][0] == board[x][1] && board[x][0] ==  board[x][2]) {
                return true;
            }
        }

        return false;
    }

    private boolean testVertical() {
        for (int y = 0; y < 3; y++) {
            if (board[0][y] != ' ' && board[0][y] == board[1][y] && board[1][y] ==  board[2][y]) {
                return true;
            }
        }

        return false;
    }

}
