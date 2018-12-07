public class TicTacToe {

    char [][] board;

    public TicTacToe() {
        board = new char [3][3];
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

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
