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
                board [outerIndex][innerIndex] = '$';
                // cody was here ;)
            }
        }
    }

    public void play(int x, int y) {
        board[x][y] = player;

        if (player == 'X') {
            player = 'O';
        } else {
            player = 'X';
        }
    }
}
