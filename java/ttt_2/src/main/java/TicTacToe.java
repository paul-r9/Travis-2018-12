public class TicTacToe {

    private boolean[][] board = {
            {false, false, false},
            {false, false, false},
            {false, false, false}
    };

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public boolean isValidCoordinate(int x, int y) {
        return x >= 0 && x <= 2 && y >= 0 && y <= 2;
    }

    public void placeToken(int x, int y) {
        board[x][y] = true;
    }

    public boolean isCoordTaken(int x, int y) {
        return board[x][y];
    }
}
