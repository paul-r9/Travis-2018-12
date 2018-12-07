public class TicTacToe {


    private char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public boolean isValidCoordinate(int x, int y) {
        return x >= 0 && x <= 2 && y >= 0 && y <= 2;
    }

    public void placeToken(int x, int y, char token) {
        board[x][y] = token;
    }

    public boolean isCoordTaken(int x, int y) {
        return board[x][y] != ' ';
    }
}
